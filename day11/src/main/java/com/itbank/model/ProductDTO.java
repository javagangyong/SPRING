package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//TABLE PRODUCT
//IDX             NOT NULL NUMBER         
//PRODUCTNAME     NOT NULL VARCHAR2(200)  
//IMG             NOT NULL VARCHAR2(2000) 
//PRICE           NOT NULL NUMBER         
//PRODUCTQUANTITY          NUMBER 

public class ProductDTO {
	
	private int idx;
	private String productName;
	private String img;
	private int price;
	private int productQuantity;
	
	private MultipartFile upload;
	
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

}
