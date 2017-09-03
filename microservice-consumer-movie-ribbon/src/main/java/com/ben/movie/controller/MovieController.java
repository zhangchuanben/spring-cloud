package com.ben.movie.controller;

import com.ben.movie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chuanben on 2017/9/2.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://microservice-provider-user/simple/"+id, User.class);
    }
}
