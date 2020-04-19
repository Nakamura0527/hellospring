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
        return String.format("Hello %s!", name);
    }

}
