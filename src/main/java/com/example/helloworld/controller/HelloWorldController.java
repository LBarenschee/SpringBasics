package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld") // http://localhost:8080/helloworld
public class HelloWorldController {
    @GetMapping
    public String getHelloWorld(){
        return "Hello World";
    }

}
