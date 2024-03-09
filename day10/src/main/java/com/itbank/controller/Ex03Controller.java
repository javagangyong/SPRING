package com.itbank.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itbank.service.MemberService;

@Controller
public class Ex03Controller {
//	@RequestBody : 요청에 담긴 내용이 파라미터로 그대로 사용된다
//	@ResponseBody : 반환하는 내용 그 자체가 응답이다
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	
	@GetMapping("/ex03")
	public void ex03() {}
	


}
