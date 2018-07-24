package com.challenage.server.server.repos;

import com.challenage.server.server.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findById(int id);
    List<User> findByName(String name);
    @Query("select u from user u where u.name=:naeme and u.city = :city")
    User withNameAndCityQuery(@Param("name")String name,@Param("city")String city);
    User findByPhoneNumber(String PhoneNumber);
}
