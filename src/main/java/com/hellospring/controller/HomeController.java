package com.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellospring.mapper.UserMapper;

@Controller
public class HomeController {
	@Autowired
    PasswordEncoder passwordEncoder;

	@Autowired
	private UserMapper userMapper;

	@GetMapping("/home")
	 public String list(Model model,
			 @RequestParam(value = "username") String username,
			 @RequestParam(value = "password") String password) {
		userMapper.insert(username, passwordEncoder.encode(password));
	 	return "list";
	 }

}
