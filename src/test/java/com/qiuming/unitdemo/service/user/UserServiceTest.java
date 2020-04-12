package com.qiuming.unitdemo.service.user;

import com.qiuming.unitdemo.bean.user.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    public void add() {
        int expect = 5;
        int actual = userService.add(2, 3);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testDec() {
        int expect = 1;
        int actual = userService.dec(3, 2);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testDec1() {
        int expect = 6;
        int actual = userService.dec(4, 2);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void getUserList() {
        List<User> userList = userService.getUserList();

    }

    @Test
    public void getUserInfo(){
        String expect = "qiuming";
        String actual = userService.getUserInfo("qiuming");
        Assert.assertEquals(expect,actual);
    }
    @Test
    @Transactional
    public void insertUser() {
        User user = new User();
        user.setUserName("huangxueqing");
        int expect = 1;
        int actual = userService.insertUser(user);
        Assert.assertEquals(expect,actual);
    }
}
