package com.itbank.test1;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// 스프링에서는 프로그램에 사용되는 모든 객체를 초기작동시 준비한다
// 따라서 구동중인 프로젝트 중간에 새로운 클래스를 작성했다면, 서버를 재시작해주어야 한다

@Controller
public class Ex02Controller {
	
	private ArrayList<FoodDTO> list = new ArrayList<FoodDTO>();
	
	@GetMapping("/ex02")
	public void ex02(Model model) {
		model.addAttribute("list", list);
	}
	// 컨트롤러 함수의 반환형이 void이면, 요청 주소를 viewName으로 활용한다
	// while(viewName.contains("//") { viewName = viewName.replace("//", "/"); }
	// "/WEB-INF/views//ex02.jsp" -> "/WEB-INF/views/ex02.jsp"
	// 요청주소과 jsp의 이름이 일치한다면, 문자열을 반환하지 않아도 된다

	@PostMapping("/ex02")
	public String ex02(FoodDTO dto) {
		list.add(dto);
		return "redirect:/ex02";	// 리다이렉트는 jsp로 가지 않고, 다른 주소로 요청하게 한다
	}
	
	
}
