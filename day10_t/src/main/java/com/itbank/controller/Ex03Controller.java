package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Ex03Controller {
//	@RequestBody : 요청에 담긴 내용이 파라미터로 그대로 사용된다
//	@ResponseBody : 반환하는 내용 그 자체가 응답이다
	
	private ObjectMapper objectMapper = new ObjectMapper();	// jackson-databind
	

	@GetMapping("/ex03")
	public void ex03() {}
	
	
}
