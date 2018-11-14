package com.feng.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：hello,springboot
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/11/14 10:06
 */
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String sayHello(){
        return "hello,springboot";
    }
}
