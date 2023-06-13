package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;
@Repository
public class UserDao {
	
	@Autowired
	private SqlSession  sqlSession;
	
	/* 회원가입:회원정보 저장 */
	
	 public int insertUser(UserVo userVo) {
	 System.out.println("UserDao.insert()");
	 System.out.println(userVo);
	 int count = sqlSession.selectOne("user.insert",userVo);
	 return count;
	 
	 
	 }
	 

}
