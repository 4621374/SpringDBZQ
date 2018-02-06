package com.dbzq.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class LoginController {
	@RequestMapping("/login")
	public String login(HttpSession httpSession,String username,String password) {
		httpSession.setAttribute("username",username);
		
		return "redirect:/items/queryItems.action";
		
	}

	@RequestMapping("/logout")
	public String logout(HttpSession httpSession)throws Exception {
		httpSession.invalidate();
		
		return "redirect:/items/login.action";
		
	}
}
