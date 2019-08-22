package com.example.demo.service.impl;

import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    @Transactional
    public String addUser(User user) throws Exception {
        userMapper.addUser(user);
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        int count = userMapper.addUser(user);
            if(count == 1){
                int i=1/0;
            }
            System.out.println("影响行数" + count);
        return count > 0 ? "数据插入成功":"数据插入失败";
    }
}
