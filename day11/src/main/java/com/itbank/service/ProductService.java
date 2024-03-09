package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.FileComponent;
import com.itbank.model.ProductDTO;
import com.itbank.repository.ProductDAO;

@Service
public class ProductService {
	
	@Autowired private ProductDAO dao;
	@Autowired private FileComponent fileComponent;

	public List<ProductDTO> getList() {
		return dao.selectList();
	}

	public int add(ProductDTO dto) {
		String img = fileComponent.upload(dto.getUpload());
		dto.setImg(img);
		return dao.insert(dto);
	}

	public ProductDTO productOne(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

}
