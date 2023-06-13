package com.javaex.vo;

public class UserVo {
	private int no;
	private String id;
	private String password;
	private String name;
	
	
	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserVo(int no, String id, String password, String name) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "UserVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
	
	
}
