package place.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

	String clientId = "dUS0vgsxicAwYBOdrZRw";// 클라이언트 아이디값;
	String clientSecret = "tE4a81hlX2";// 클라이언트 시크릿값;
	
	public String searchBlog(String query){

/*		String text="";
		String result="";
		try {
			text = URLEncoder.encode(query, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text; // json결과
			// String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; //xml 결과 
			result = getAPI(apiURL,query);
			System.out.println("blog:"+result);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String result = getAPI("search/blog",query);
		return result;
	}
	public String searchLocal(String query){
/*		String text="";
		String result="";
		try {
			text = URLEncoder.encode(query, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/local?query=" + text; // json결과
			result = getAPI(apiURL,query); 			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return new ModelAndView("review", "result", result);
		return result;*/
		String result = getAPI("search/local",query);
		return result;
	}
	
	//public String getAPI(String apiURL,String query){
	public String getAPI(String apiKind,String query){
			
		String result="";
		try {
			String text = URLEncoder.encode(query, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/"+apiKind+"?query=" + text; // json결과
			// String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; //xml 결과 
			
			//String text = URLEncoder.encode(query, "UTF-8");
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			result = response.toString();
			result = URLEncoder.encode(result, "UTF-8");
			System.out.println(response.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
		//return result;
	}
}
