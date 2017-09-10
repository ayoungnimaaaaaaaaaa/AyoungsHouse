package place.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import org.mortbay.jetty.EncodedHttpURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import place.dao.TestDAO;
import place.service.ApiService;
import place.vo.Test;

@RestController
public class ApiController {

	@Autowired
	TestDAO dao;

	@Autowired
	ApiService apiService;
	
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
	@RequestMapping(value = "/search/blog")
	public String searchBlog(@RequestParam("query") String query) {
		
		String result = apiService.searchBlog(query);
		System.out.println(result);
		return result;
	}
	
	/*
	 * 지역 검색 결과 리턴
	 * */
	@RequestMapping(value = "/search/local")
	public String searchLocal(@RequestParam("query") String query) {
		String result = apiService.searchLocal(query);
		System.out.println(result);
		return result;
	}
	

}
