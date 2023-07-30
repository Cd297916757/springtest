package com.nineya.springboot.mapper;

import com.nineya.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper //注释为Mapper
public interface UserMapper {
    User getUser(long uid);
}
