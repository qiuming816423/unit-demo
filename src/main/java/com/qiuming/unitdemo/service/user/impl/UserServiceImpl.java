package com.qiuming.unitdemo.service.user.impl;

import com.qiuming.unitdemo.bean.user.User;
import com.qiuming.unitdemo.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qiuming.unitdemo.service.user.IUserService;;import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
@Autowired
private UserMapper userMapper;

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int dec(int a, int b) {
        if (a == 3) {
            return a - b;
        } else {
            return a + b;
        }
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public String getUserInfo(String userName) {
        return userMapper.getUserInfo(userName);
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
