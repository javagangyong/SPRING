package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ProductDTO;
import com.itbank.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired private ProductService service;

	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<ProductDTO> list = service.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(ProductDTO dto) {
		int insert = service.add(dto);
		System.out.println(insert != 0 ? "등록 성공" : "등록 실패");
		return "redirect:/";
	}
	
	@GetMapping("/list/{idx}")
	public ModelAndView productOne(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/product/list");
		ProductDTO dto = service.productOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
}
