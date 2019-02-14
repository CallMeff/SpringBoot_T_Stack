package com.feng.controller;

import com.feng.excetion.BusinessException;
import com.feng.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @desc say hello
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2019/2/14 15:24
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public String sayHelloTogethor(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.sayHelloWithEnglish());
        sb.append(helloService.sayHelloWithChinese());
        return String.valueOf(sb);
    }

}
