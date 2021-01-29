package com.hellospring.controller;

import com.hellospring.domain.Todo;
import com.hellospring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {

    @Autowired
    private TodoService service;

    @RequestMapping("/todos")
    public List<Todo> list(Model model) {
        List<Todo> todoList = service.findTodoList();
        return todoList;
    }

    @RequestMapping("/hello/{name}")
    public String hellorest(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }

}
