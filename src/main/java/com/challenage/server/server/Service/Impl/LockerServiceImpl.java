package com.challenage.server.server.Service.Impl;

import com.challenage.server.server.Dao.LockerDao;
import com.challenage.server.server.Entity.Locker;
import com.challenage.server.server.Service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LockerServiceImpl implements LockerService {
    @Autowired
    LockerDao lockerDao;
    @Override
    public int add(Locker locker) {
        return lockerDao.add(locker);
    }

    @Override
    public int update(Locker locker) {
        return lockerDao.update(locker);
    }

    @Override
    public int delete(Long id) {
        return lockerDao.delete(id);
    }

    @Override
    public List<Locker> findAllLocker(){
        return lockerDao.findAllLocker();
    }
}
