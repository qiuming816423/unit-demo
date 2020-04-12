package com.qiuming.unitdemo.mapper.user;

import org.apache.ibatis.annotations.Mapper;
import com.qiuming.unitdemo.bean.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

 List<User> getUserList();

 String getUserInfo(@Param("userName") String userName);

 Integer insertUser(User user);
}
