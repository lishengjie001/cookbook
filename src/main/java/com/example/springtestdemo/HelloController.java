package com.example.springtestdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        System.out.println("controller 被调用");
        return "welcome to the new age";
    }
}
