package com.ben.movie.controller;

import com.ben.movie.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chuanben on 2017/9/5.
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
    // getmapping 不支持，PathVariable要设置value
    @RequestMapping(method = RequestMethod.GET,value = "/simple/{id}")
    User findById(@PathVariable("id") Long id);
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    User postUser(@RequestBody User user);
}
