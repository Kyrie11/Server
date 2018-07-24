package com.challenage.server.server.Dao;

import com.challenage.server.server.Entity.Locker;

import java.util.List;

public interface LockerDao {
    int add(Locker locker);
    int update(Locker locker);
    int delete(Long id);
    List<Locker> findAllLocker();
}
