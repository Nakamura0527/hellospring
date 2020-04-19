package com.hellospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hellospring.domain.Todo;
import com.hellospring.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService service;

	@RequestMapping("/list/")
	public String list(Model model) {
//		List<Todo> todoList = service.findTodoList();
		List<Todo> todoList = service.findTodoList2();
		model.addAttribute("todoList", todoList);
		return "hello";
	}

	@RequestMapping("/hello/{id}")
	public String hello(Model model, @PathVariable String id) {
		Todo todo = service.getTodo(Integer.parseInt(id));
		model.addAttribute("todo", todo);
		return "hello";
	}
}
