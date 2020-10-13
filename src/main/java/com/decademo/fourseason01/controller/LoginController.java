package com.decademo.fourseason01.controller;

import com.decademo.fourseason01.dao.UserDao;
import com.decademo.fourseason01.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping(value = "/login")
    public Map<String,String> toLogin(@RequestBody Map<String,String> loginUserInfo, HttpSession session){
        Map<String,String> map = new HashMap<>();
        if(loginUserInfo.get("username") != null && loginUserInfo.get("password") != null){
            String username = loginUserInfo.get("username");
            String password = loginUserInfo.get("password");

            User user = userDao.getInfo(username, password);
            if(user != null){
                map.put("code","111");
                map.put("msg","登录成功");
            }else{
                map.put("code","222");
                map.put("msg","登录失败，用户账号或密码错误");
            }
        }else{
            map.put("code","444");
            map.put("msg","登录失败，未输入信息");
        }
        return map;
    }
}
