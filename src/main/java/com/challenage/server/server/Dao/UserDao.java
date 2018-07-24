package com.challenage.server.server.Dao;

import com.challenage.server.server.Entity.User;

import java.util.List;

public interface UserDao {
    int add(User user);
    int update(User user);
    int delete(Long id);
    List<User> findAllUser();
}
