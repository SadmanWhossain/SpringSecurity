package com.springdemo.springsecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello World " + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about() {
        return "Welcome to logout";
    }
}
