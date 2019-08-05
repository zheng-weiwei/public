package com.example.demo.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: HelloWorldController
 * Author:   RollerRunning
 */
@RestController
//引入自定义配置文件
@PropertySource(value = {"classpath:config/myconfig.properties"}, encoding = "UTF-8")
public class HelloWorldController {
    //通过@Value属性，引入配置文件中的属性
    @Value("${user.myname}")
    private String name;

    @Value("${user.age}")
    private Integer age;

    @Value("${user.address}")
    private String address;

    @RequestMapping("hello")
    public String hello() {
        System.out.println("name: " + name + " ,age: " + age + " ,address: " + address);
        return "name: " + name + " ,age: " + age + " ,address: " + address;
    }
}
