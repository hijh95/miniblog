package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	//메인페이지
	@RequestMapping(value="/", method= {RequestMethod.GET, RequestMethod.POST})
	public String main() {
		System.out.println("MainController/index()");
		
		return "main/index";
	}
	
	//블로그
	@RequestMapping(value="/blog", method= {RequestMethod.GET, RequestMethod.POST})
	public String blog() {
		System.out.println("MainController/blog()");
		
		return "blog/blog-main";
	}

}
