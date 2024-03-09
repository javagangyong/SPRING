package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.SurveyDTO;

@Repository
public interface SurveyDAO {
	
	List<SurveyDTO> selectList();

	int insert(SurveyDTO dto);

	SurveyDTO selectOne(int idx);

}
