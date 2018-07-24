package com.challenage.server.server.Impl;

import com.challenage.server.server.Entity.Locker;
import com.challenage.server.server.repos.LockerRepositroyCustom;
import org.springframework.beans.factory.annotation.Autowired;

public class LockerRepositoryImpl implements LockerRepositroyCustom {
    public void test(){};

    @Autowired
    private Locker locker;


}
