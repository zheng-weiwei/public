package com.example.demo.helloworld.dao;

import com.example.demo.helloworld.entity.UserInfo;
import org.apache.ibatis.annotations.*;

/**
 * FileName: UserDao
 * Author:   RollerRunning
 * Date:     2019/8/6 6:05 PM
 * Description:
 */
@Mapper
public interface UserMapper {
    /**
     * @param userInfo
     * @return int
     * @description 新增用户
     **/
    int addUserInfo(UserInfo userInfo);

    /**
     * @param userInfo
     * @return int
     * @description 修改用户
     **/
    int update(UserInfo userInfo);

    /**
     * @param id
     * @return int
     * @description 删除用户
     **/
    int delete(int id);

    /**
     * @param
     * @return java.util.List<com.example.demo.helloworld.entity.UserInfo>
     * @description 查询用户
     **/
    UserInfo selectUser(Integer id);
}
