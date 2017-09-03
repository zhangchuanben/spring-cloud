package com.ben.user.repository;

import com.ben.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chuanben on 2017/9/2.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
