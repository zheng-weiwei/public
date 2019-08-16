package com.example.demo.helloworld.controller;

import com.example.demo.helloworld.entity.UserInfo;
import com.example.demo.helloworld.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * FileName: HelloWorldController
 * Author:   RollerRunning
 */
@RestController
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    //private static final Logger log = LogManager.getLogger(HelloWorldController.class);

    @Autowired
    private UserService userService;

    /**
     * @param userName, address, addTime
     * @return void
     * @description 新增用户信息
     **/
    @RequestMapping("add")
    public String hello(String userName, String address) {
        System.out.println("接收到前端传递的参数信息，userName=" + userName + ", address=" + address);
        userService.addUser(userName, address, new Date());
        return "success";
    }

    /**
     * @param id, userName, address, addTime
     * @return int
     * @description 修改用户
     **/
    @RequestMapping("update")
    public String update(Integer id, String userName, String address) {
        System.out.println("接收到前端传递的参数信息，id=" + id + ", userName=" + userName + ", address=" + address);
        userService.updateUser(id, userName, address, new Date());
        return "success";
    }

    /**
     * @param id
     * @return int
     * @description 删除用户
     **/
    @RequestMapping("delete")
    public String delete(Integer id) {
        System.out.println("接收到前端传递的参数信息，id=" + id);
        userService.deleteUser(id);
        String a = "result";
        Integer.parseInt(a);
        return "success";
    }

    /**
     * @param id
     * @return int
     * @description 查询用户
     **/
    @RequestMapping("select")
    public UserInfo select(Integer id) {
        logger.info("接收到的id为{}", id);
        System.out.println("接收到前端传递的参数信息，id=" + id);
        UserInfo userInfo = userService.selectUser(id);
        return userInfo;
    }

}
