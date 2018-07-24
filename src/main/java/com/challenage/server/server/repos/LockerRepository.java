//数据访问接口
package com.challenage.server.server.repos;

import com.challenage.server.server.Entity.Locker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LockerRepository extends JpaRepository<Locker,Long>,LockerRepositroyCustom {
    List<Locker> findByLocation(String location);
    Locker findByNumber(int Number);
}
