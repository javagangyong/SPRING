package com.itbank.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/chat")
public class ChatController {

	private Set<String> userlist = new HashSet<String>();
	
	@GetMapping("/rooms")
	public ModelAndView rooms(String username, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		if(username != null) {
			session.setAttribute("username", username);
			userlist.add(username);
		}
		mav.addObject("userlist", userlist);
		return mav;
	}
	
//	@GetMapping("/room")
	
	
}
