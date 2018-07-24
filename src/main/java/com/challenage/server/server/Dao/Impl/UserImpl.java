package com.challenage.server.server.Dao.Impl;

import com.challenage.server.server.Dao.UserDao;
import com.challenage.server.server.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        return jdbcTemplate.update("insert into user(name,phonenumber,sex,city,credit) values(?,?,?,?,?)"
                ,user.getName(),user.getPhoneNumber(),user.getSex(),user.getCity(),user.getCredit());
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("update user set name=?,phonenumber=?,sex=?,city=?,credit=? where id=?"
                ,user.getName(),user.getPhoneNumber(),user.getSex(),user.getCity(),user.getCredit(),user.getId());
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update("delete from table user where id=?",id);
    }

    @Override
    public List<User> findAllUser() {
        List<User> list = jdbcTemplate.query("select * from user",new Object[]{},new BeanPropertyRowMapper<>(User.class));
        return list;
    }
}
