package com.ben.user.controller;

import com.ben.user.entity.User;
import com.ben.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chuanben on 2017/9/2.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
}
