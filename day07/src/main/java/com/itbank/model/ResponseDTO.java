package com.itbank.model;

//IDX           NOT NULL NUMBER        
//SURVEY_IDX    NOT NULL NUMBER        
//WRITER        NOT NULL VARCHAR2(100) 
//CHOICE 		NOT NULL NUMBER

public class ResponseDTO {
	
	private int idx;
	private int survey_idx;
	private String writer;
	private int choice;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getSurvey_idx() {
		return survey_idx;
	}
	public void setSurvey_idx(int survey_idx) {
		this.survey_idx = survey_idx;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}

	
}