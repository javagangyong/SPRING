package com.itbank.model;

//IDX      NOT NULL NUMBER         
//TITLE    NOT NULL VARCHAR2(500)  
//WRITER   NOT NULL VARCHAR2(100)  
//CONTENT1 NOT NULL VARCHAR2(2000) 
//CONTENT2 NOT NULL VARCHAR2(2000) 
//IMG1     NOT NULL VARCHAR2(500)  
//IMG2     NOT NULL VARCHAR2(500) 

public class BoardDTO {
	
	private int idx;
	private String title;
	private String writer;
	private String content1;
	private String content2;
	private String image1;
	private String image2;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getContent2() {
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}

}
