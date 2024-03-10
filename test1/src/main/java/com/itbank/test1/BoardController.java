package com.itbank.test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.repository.BoardDAO;
import com.itbank.repository.BoardDTO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDAO dao;
	
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		// ModelAndView 클래스는 함수의 반환형 String과 request.setAttribute 기능을 합친 클래스이다
		
		ModelAndView mav = new ModelAndView("board");	// 생성자 매개변수에 viewName을 지정
		
		// request.setAttribute(name, object)
		// model.addAttriute(name, object)
		// mav.addObject(name, abject)
		
		List<BoardDTO> list = dao.selectList();	// dao에서 리스트를 불러온다
		mav.addObject("list", list);	// list를 추가하여  JSP에서 참조할 수 있도록 한다
		
		return mav;
	}
}
