package com.example.HelloWorldDemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldDemo2 {
 @GetMapping("JEEVA")
    public String Jeeva()
 {
     return"123456 ";
 }

}
