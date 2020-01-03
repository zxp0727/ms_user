package com.learn.ms_user.controller;

import com.learn.ms_user.domain.entity.User;
import com.learn.ms_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description 用户控制器
 * @Author ZhouXiaoPing
 * @Date 2020/1/3 15:37
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getById/{id}")
    public User getById(@PathVariable Integer id){
        return userService.getById(id);
    }
}
