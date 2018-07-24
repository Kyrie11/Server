package com.challenage.server.server.Service;

import com.challenage.server.server.Entity.User;

import java.util.List;

public interface UserService {
    int add(User user);
    int update(User user);
    int delete(Long id);
    List<User> findAllUser();
}
