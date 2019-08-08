package com.example.demo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName: ThymeleafController
 * Author:   RollerRunning
 * Date:     2019/8/8 2:41 PM
 * Description: 解析数据并返回一个Thymeleaf模板.html
 * <p>
 * 注：这里不能使用@RestController注解，因为@RestController = @Controller + @ResponseBody
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/learn")
    public String hello(Model model, String message) {
        System.out.println("接收到的前端数据为：" + message);
        model.addAttribute("result", "Message Is: " + message);
        return "hello";
    }
}
