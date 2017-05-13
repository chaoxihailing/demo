package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 潮汐 on 2017/5/13.
 */

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin_name(String login_in);
}
