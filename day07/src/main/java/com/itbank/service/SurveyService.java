package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ResponseDTO;
import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;

@Service
public class SurveyService {
	
	@Autowired private SurveyDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public SurveyService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}

	public List<SurveyDTO> getSurveyList() {
		return dao.selectList();
	}

	public int upload(SurveyDTO dto) {
		String img1 = dto.getUpload1().getOriginalFilename();
		String img2 = dto.getUpload2().getOriginalFilename();
		
		File f1 = new File(saveDirectory, img1);
		File f2 = new File(saveDirectory, img2);
		try {
			dto.getUpload1().transferTo(f1);
			dto.getUpload2().transferTo(f2);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		dto.setImg1(img1);
		dto.setImg2(img2);

		return dao.insert(dto);
	}

	public SurveyDTO getSurveyOne(int idx) {
		return dao.selectOne(idx);
	}

	public ResponseDTO getResult(ResponseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
