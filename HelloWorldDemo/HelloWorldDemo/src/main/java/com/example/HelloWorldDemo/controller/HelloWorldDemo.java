package com.example.HelloWorldDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemo {

@GetMapping ("helloworld")
    public String helloworld()
    {
        return "Hello Jeeva";
    }

}
