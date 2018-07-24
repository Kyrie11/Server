package com.challenage.server.server.Service;

import com.challenage.server.server.Entity.Locker;


import java.util.List;


public interface LockerService {
    int add(Locker locker);
    int update(Locker locker);
    int delete(Long id);
    List<Locker> findAllLocker();
}
