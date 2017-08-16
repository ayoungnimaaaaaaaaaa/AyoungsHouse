package place.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import place.dao.TestDAO;
import place.vo.Test;

@Controller
public class ApiController {

	@Autowired
	TestDAO dao;
	String clientId = "dUS0vgsxicAwYBOdrZRw";// 클라이언트 아이디값;
	String clientSecret = "tE4a81hlX2";// 클라이언트 시크릿값;
	
	@RequestMapping(value="/test")
	public String test(){
		List<Test> list=dao.selectAll();
		System.out.println(list.size());
		return "test";
	}
	
	@RequestMapping(value = "/map")
	public String map() {
		return "map";
	}

	/*
	 * 블로그 검색 결과 리턴
	 * */
	@RequestMapping(value = "/searchBlog")
	public ModelAndView searchBlog(@RequestParam("query") String query) {
		String text="";
		String result="";
		try {
			text = URLEncoder.encode(query, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text; // json결과
			// String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; //xml 결과 
			result = getAPI(apiURL,query); 			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("review", "result", result);
	}
	
	/*
	 * 지역 검색 결과 리턴
	 * */
	@RequestMapping(value = "/searchLocal")
	public ModelAndView searchLocal(@RequestParam("query") String query) {
		String text="";
		String result="";
		try {
			text = URLEncoder.encode(query, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/local?query=" + text; // json결과
			result = getAPI(apiURL,query); 			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("review", "result", result);
	}
	
	public String getAPI(String apiURL,String query){
		String result="";
		try {
			String text = URLEncoder.encode(query, "UTF-8");
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
			System.out.println(response.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
