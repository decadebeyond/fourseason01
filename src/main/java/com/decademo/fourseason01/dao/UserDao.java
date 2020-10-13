package com.decademo.fourseason01.dao;

import com.decademo.fourseason01.entities.User;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Insert("insert into user(username,password,nickname,phonenumber,email)" +
            " values(#{user.username},#{user.password},#{user.nickname},#{user.phonenumber},#{user.email})")
    public int user_Register(@Param("user") User user);

    @Select("select username,password,nickname,phonenumber,email " +
            " from user" +
            " where username = #{username}" +
            " and password = #{password}")
    public User getInfo(@Param("username")String username,@Param("password")String password);
}
