package com.challenage.server.server.Dao.Impl;

import com.challenage.server.server.Dao.LockerDao;
import com.challenage.server.server.Entity.Locker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LockerImpl implements LockerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Locker locker) {
        return jdbcTemplate.update("insert into locker(location,electricity) values(?,?)",
                locker.getLocation(),locker.getElectricity());
    }

    @Override
    public int update(Locker locker) {
        return jdbcTemplate.update("update locker set location=?,electricity=? where id=?",locker.getLocation(),locker.getElectricity(),locker.getId());
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update("delete from table locker where id=?",id);
    }

    @Override
    public List<Locker> findAllLocker(){
        List<Locker> list = jdbcTemplate.query("select * from locker",new Object[]{},new BeanPropertyRowMapper<>(Locker.class));
        if(list!=null&&list.size()>0)
                return list;
        else
            return null;
    }
}
