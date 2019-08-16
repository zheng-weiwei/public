package com.example.demo.helloworld.service;

import com.example.demo.helloworld.entity.UserInfo;

import java.util.Date;

/**
 * FileName: UserService
 * Author:   zhengwei
 * Date:     2019/8/6 6:45 PM
 * Description:
 */
public interface UserService {
    /**
     * @param userName, address, addTime
     * @return int
     * @description 新增用户
     **/
    void addUser(String userName, String address, Date addTime);
    /**
     * @param id, userName, address, addTime
     * @return int
     * @description 修改用户
     **/
    void updateUser(Integer id, String userName, String address, Date addTime);

    /**
     * @param id
     * @return int
     * @description 删除用户
     **/
    void deleteUser(Integer id);

    /**
     * @param id
     * @return UserInfo
     * @description 查询用户
     **/
    UserInfo selectUser(Integer id);
}
