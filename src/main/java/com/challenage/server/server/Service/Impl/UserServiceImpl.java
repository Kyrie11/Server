package com.challenage.server.server.Service.Impl;

import com.challenage.server.server.Dao.UserDao;
import com.challenage.server.server.Entity.User;
import com.challenage.server.server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(Long id) {
        return userDao.delete(id);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
