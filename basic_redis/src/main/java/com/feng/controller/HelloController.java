package com.feng.controller;

import com.feng.service.HelloService;
import com.feng.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @desc：hello
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/11/15 17:15
 */
@RestController
public class HelloController {

    @Resource
    private RedisUtil<String, String> redisUtil;

    @Resource
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {

        return String.valueOf(helloService.getObjectFromRedis());

    }

}
