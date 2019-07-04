package com.taobushi.service.impl;

import com.taobushi.entity.User;
import com.taobushi.service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("保存成功"+user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("修改成功");
    }

    @Override
    public List<User> finAllUsers() {
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("张三");
        User user2 = new User();
        user1.setId(2);
        user1.setUsername("张四");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("删除成功");
    }
}
