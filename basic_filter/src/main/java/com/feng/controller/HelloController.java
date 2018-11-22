package com.feng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：你好
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/11/22 16:32
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
