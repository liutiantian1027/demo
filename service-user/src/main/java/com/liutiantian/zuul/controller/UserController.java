package com.liutiantian.zuul.controller;

import com.liutiantian.zuul.pojo.User;
import com.liutiantian.zuul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserNameById")
    public User getUserNameById(@RequestParam("id") Integer id){
        User user = userService.getUserById(id);
        System.out.println("调用的服务user");
        return user;
    }
}
