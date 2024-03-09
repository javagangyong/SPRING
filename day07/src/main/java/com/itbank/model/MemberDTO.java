package com.itbank.model;

//IDX      NOT NULL NUMBER        
//USERID   NOT NULL VARCHAR2(100) 
//USERPW   NOT NULL VARCHAR2(500) 
//USERNAME NOT NULL VARCHAR2(100) 
//GENDER            VARCHAR2(50)  
//EMAIL    NOT NULL VARCHAR2(100)

public class MemberDTO {
	
	private int idx;
	private String userid;
	private String userpw;
	private String userName;
	private String gender;
	private String email;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
