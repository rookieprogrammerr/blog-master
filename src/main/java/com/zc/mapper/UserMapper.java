package com.zc.mapper;

import com.zc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    public User login(@Param("username") String username,@Param("password") String password);
}
