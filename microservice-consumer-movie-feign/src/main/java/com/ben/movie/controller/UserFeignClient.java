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
    // 该请求不会成功，只要参数是复杂对象，即使指定了是GET方法，feign依然会以POST方法进行发送请求。可能是我没找到相应的注解或使用方法错误。
    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
    public User getUser(User user);
}
