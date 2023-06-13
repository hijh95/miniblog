package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joingForm() {
		System.out.println("UserController.joinForm()");
		//System.out.println(userVo);
		//userService.join(userVo);
		return "user/joinForm";
	}
	
	/* 회원가입 */
	@RequestMapping(value = "/join", method = {RequestMethod.GET, RequestMethod.POST} )
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController.join()");

		userService.join(userVo);
		
		return "user/joinSuccess";
	}

}
