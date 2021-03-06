package com.lxc.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxc.springboot.dao.UserDAO;
import com.lxc.springboot.pojo.User;

@Service
public class UserService {

	@Autowired // 注入Spring容器中的bean对象
    private UserDAO userDAO;

    public List<User> queryUserList() {
        // 调用userDAO中的方法进行查询
        return this.userDAO.queryUserList();
    }

}
