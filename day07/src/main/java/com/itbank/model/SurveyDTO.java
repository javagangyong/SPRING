package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//IDX      NOT NULL NUMBER        
//TITLE    NOT NULL VARCHAR2(500) 
//WRITER   NOT NULL VARCHAR2(500) 
//CONTENT1 NOT NULL VARCHAR2(500) 
//CONTENT2 NOT NULL VARCHAR2(500) 
//IMG1     NOT NULL VARCHAR2(500) 
//IMG2     NOT NULL VARCHAR2(500)

public class SurveyDTO {
	
	private int idx;
	private String title;
	private String writer;
	private String content1;
	private String content2;
	private String img1;
	private String img2;
	
	private MultipartFile upload1;
	private MultipartFile upload2;
	

	public MultipartFile getUpload1() {
		return upload1;
	}
	public void setUpload1(MultipartFile upload1) {
		this.upload1 = upload1;
	}
	public MultipartFile getUpload2() {
		return upload2;
	}
	public void setUpload2(MultipartFile upload2) {
		this.upload2 = upload2;
	}
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
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}

	
}
