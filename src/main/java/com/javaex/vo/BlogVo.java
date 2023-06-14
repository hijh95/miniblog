package com.javaex.vo;

public class BlogVo {
	private String address;
	private String title;
	private String logo;
	private String setting;
	private String categori;
	private String addwrite;
	public BlogVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlogVo(String address, String title, String logo, String setting, String categori, String addwrite) {
		super();
		this.address = address;
		this.title = title;
		this.logo = logo;
		this.setting = setting;
		this.categori = categori;
		this.addwrite = addwrite;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getSetting() {
		return setting;
	}
	public void setSetting(String setting) {
		this.setting = setting;
	}
	public String getCategori() {
		return categori;
	}
	public void setCategori(String categori) {
		this.categori = categori;
	}
	public String getAddwrite() {
		return addwrite;
	}
	public void setAddwrite(String addwrite) {
		this.addwrite = addwrite;
	}
	
	@Override
	public String toString() {
		return "BlogVo [address=" + address + ", title=" + title + ", logo=" + logo + ", setting=" + setting
				+ ", categori=" + categori + ", addwrite=" + addwrite + "]";
	}
	
	
	
}
