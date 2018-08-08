package com.lxc.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import com.lxc.springboot.pojo.User;

public class UserDAO {
    
    public List<User> queryUserList(){
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("username_" + i);
            user.setPassword("password_" + i);
            user.setAge(i + 1);
            result.add(user);
        }
        return result;
    }

}
