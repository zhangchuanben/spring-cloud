package com.ben.movie.controller;

import com.ben.movie.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chuanben on 2017/9/5.
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
    // getmapping 不支持，PathVariable要设置value
    @RequestMapping(method = RequestMethod.GET,value = "/simple/{id}")
    User findById(@PathVariable("id") Long id);
}
