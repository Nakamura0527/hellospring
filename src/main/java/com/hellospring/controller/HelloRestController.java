package com.hellospring.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/hellorest/{name}")
    @Transactional
    public String hellorest(@PathVariable String name) {
//        Todo loadedTodo = todoMapper.select(100); // インサートしたTodoを取得して標準出力する
//        System.out.println("ID       : " + loadedTodo.getId());
//        System.out.println("TITLE    : " + loadedTodo.getTitle());
//        System.out.println("CONTENT  : " + loadedTodo.getContent());
        return String.format("Hello %s!", name);
    }

}
