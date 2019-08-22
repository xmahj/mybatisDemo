package com.example.demo.service;

import com.example.demo.dao.User;
import org.springframework.stereotype.Service;

public interface UserService {
    String addUser(User user) throws Exception;
}
