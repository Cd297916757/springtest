package com.nineya.springboot.service.impl;

import com.nineya.springboot.mapper.UserMapper;
import com.nineya.springboot.entity.User;
import com.nineya.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("impl1")    //注释为服务，指定bean名称为impl1
public class HelloServiceImpl implements HelloService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(long uid) {
        return userMapper.getUser(uid);
    }
}
