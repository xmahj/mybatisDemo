package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user) throws Exception {
       user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        return userService.addUser(user);
    }
}
