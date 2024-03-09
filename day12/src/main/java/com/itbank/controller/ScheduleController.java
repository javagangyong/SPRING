package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itbank.model.ScheduleDTO;
import com.itbank.repository.ScheduleDAO;

@RestController
@RequestMapping("/schedules")
@CrossOrigin(origins = {
//		"http://localhost:8080",
		"http://192.168.112.37:8080",
		"http://192.168.112.25:8080",
		"http://192.168.112.13:8080",
		"http://192.168.112.32:8080"
		})
public class ScheduleController {

	@Autowired private ScheduleDAO dao;
	
	@GetMapping
	public List<ScheduleDTO> selectList() {
		return dao.selectList();
	}
	
//	@GetMapping(produces = "application/json; charset=utf-8")
//	public String selectList() throws JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		String json = mapper.writeValueAsString(dao.selectList());
//		return json;
//	}
	
	@PostMapping
	@CrossOrigin
	public int add(@RequestBody ScheduleDTO dto) {
		// JSON으로 전달되는 데이터를 DTO로 맵핑하려면 @RequestBody를 사용한다
		// 자바 객체를 반환하면 JSON형식의 문자열로 반환하기 위해서 @ResponseBody를 사용한다 (생략)
		// @RestController 내부의 모든 함수는 @ResponseBody가 기본적용된다
		int row = 0;
//		System.out.println(dto.getMemo());
//		System.out.println(dto.getsDate());
		row = dao.insert(dto);
		return row;
	}
	
	@DeleteMapping("/{idx}")
	public int delete(@PathVariable("idx") int idx) {
		int row = 0;
		row = dao.delete(idx);
		return row;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
