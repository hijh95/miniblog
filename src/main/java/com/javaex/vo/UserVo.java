package com.javaex.vo;

public class UserVo {
	private int no;
	private String id;
	private String password;
	private String userName;

	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVo(int no, String id, String password, String userName) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.userName = userName;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserVo [no=" + no + ", id=" + id + ", password=" + password + ", userName=" + userName + "]";
	}

}
