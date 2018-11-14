package com.feng.controller;

import com.feng.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @desc：hello
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/11/14 11:31
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hello/{userId}")
    public String sayHello(@PathVariable int userId){
        return helloService.userSayHello(userId);
    }



}
