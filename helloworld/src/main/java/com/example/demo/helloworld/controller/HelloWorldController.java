package com.example.demo.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: HelloWorldController
 * Author:   RollerRunning
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello World!";
    }
}
