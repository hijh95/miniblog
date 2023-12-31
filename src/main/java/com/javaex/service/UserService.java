package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public int join(UserVo userVo) {
		System.out.println("UserService.join()");
		System.out.println(userVo);
		int count = userDao.insertUser(userVo);
		return count;
	}
	
	//로그인
	public UserVo login(UserVo userVo) {
		System.out.println("UserService.login()");
		System.out.println(userVo);
		UserVo authUser = userDao.selectUser(userVo);

		return authUser;
		
		
	}

}
