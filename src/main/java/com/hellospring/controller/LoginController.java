package com.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hellospring.service.TService;

@Controller
public class LoginController {

	@Autowired
	private TService service;

	 @RequestMapping("/login")
	 public String login(Model model) {
	 	return "login";
	 }

	 @PostMapping
	 public String success() {
		 return "redirect:list";
	 }

	 @RequestMapping("/login-error")
	 public String error(Model model) {
	 	return "login-error";
	 }

}
