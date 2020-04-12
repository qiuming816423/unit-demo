package com.qiuming.unitdemo.service.user;

import java.util.List;
import com.qiuming.unitdemo.bean.user.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    /**
     * 两个数相加
     * @param a
     * @param b
     * @return
     */
    int add(int a, int b);

    /**
     * 两个数相加
     * @param a
     * @param b
     * @return
     */
    int dec(int a, int b);


    List<User> getUserList();

    String getUserInfo(String userName);

    Integer insertUser(User user);
}
