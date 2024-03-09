package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ResponseDTO;
import com.itbank.model.SurveyDTO;
import com.itbank.service.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired private SurveyService surveyService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<SurveyDTO> list = surveyService.getSurveyList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(SurveyDTO dto) {
		int row = surveyService.upload(dto);
		return "redirect:/survey/list";
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/survey/view");
		SurveyDTO dto = surveyService.getSurveyOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx, ResponseDTO dto) {
		ModelAndView mav = new ModelAndView("/survey/resultView");
		SurveyDTO surveyDTO = surveyService.getSurveyOne(idx);
		ResponseDTO responseDTO = surveyService.getResult(dto);
		return mav;
	}
	
	
	
}
