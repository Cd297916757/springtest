package com.nineya.springboot.service;

import com.nineya.springboot.entity.User;

//服务接口
public interface HelloService {
    User getUser(long uid);  //通过uid取得用户名称
}
