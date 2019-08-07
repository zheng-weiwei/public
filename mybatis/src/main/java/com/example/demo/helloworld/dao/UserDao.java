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
public interface UserDao {
    /**
     * @param userInfo
     * @return int
     * @description 新增用户
     **/
    @Insert("insert into user_info values(#{id}, #{userName}, #{address}, #{addTime})")
    int addUserInfo(UserInfo userInfo);

    /**
     * @param userInfo
     * @return int
     * @description 修改用户
     **/
    @Update("update user_info set user_name = #{userName}, address = #{address}, add_time = #{addTime} where id = #{id}")
    int update(UserInfo userInfo);

    /**
     * @param id
     * @return int
     * @description 删除用户
     **/
    @Delete("delete from user_info where id = #{id}")
    int delete(int id);

    /**
     * @param
     * @return java.util.List<com.example.demo.helloworld.entity.UserInfo>
     * @description 查询用户
     **/
    @Select("select id, user_name userName, address, add_time addTime from user_info where id = #{id}")
    UserInfo selectUser(Integer id);
}
