package com.ben.movie.controller;

import com.ben.movie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chuanben on 2017/9/2.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }
}
