package com.javaex.vo;

public class UserVo {
	private int userno;
	private String id;
	private String password;
	private String userName;

	public UserVo() {
		super();
	
		// TODO Auto-generated constructor stub
	}

	public UserVo(int userno, String id, String password, String userName) {
		super();
		this.userno = userno;
		this.id = id;
		this.password = password;
		this.userName = userName;
	}

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserVo [userno=" + userno + ", id=" + id + ", password=" + password + ", userName=" + userName + "]";
	}
	

	
}
