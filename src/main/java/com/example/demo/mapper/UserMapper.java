package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("Insert into user(id,name,sex) values (#{id},#{name},#{sex})")
    //@Select("select * from user")
    int addUser(User user);
}
