package com.example.demo.helloworld.service.impl;

import com.example.demo.helloworld.dao.UserMapper;
import com.example.demo.helloworld.entity.UserInfo;
import com.example.demo.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * FileName: UserService
 * Author:   zhengwei
 * Date:     2019/8/6 6:28 PM
 * Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * @param userName, address, addTime
     * @return void
     * @description 新增用户信息
     **/
    @Override
    public void addUser(String userName, String address, Date addTime) {
        //接收到用户信息，调用mapper
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setAddress(address);
        userInfo.setAddTime(addTime);
        int add = userMapper.addUserInfo(userInfo);
        System.out.println("插入用户信息返回的结果:" + add);
    }

    /**
     * @param id, userName, address, addTime
     * @return int
     * @description 修改用户
     **/
    @Override
    public void updateUser(Integer id, String userName, String address, Date addTime) {
        //接收到用户信息，调用mapper
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUserName(userName);
        userInfo.setAddress(address);
        userInfo.setAddTime(addTime);
        int update = userMapper.update(userInfo);
        System.out.println("更新用户信息返回的结果:" + update);
    }

    /**
     * @param id
     * @return
     * @description 删除用户
     **/
    @Override
    public void deleteUser(Integer id) {
        int delete = userMapper.delete(id);
        System.out.println("更新用户信息返回的结果:" + delete);
    }

    /**
     * @param id
     * @return int
     * @description 查询用户
     **/
    @Override
    public UserInfo selectUser(Integer id) {
        UserInfo userInfo = userMapper.selectUser(id);
        System.out.println("更新用户信息返回的结果:" + userInfo);
        return userInfo;
    }
}
