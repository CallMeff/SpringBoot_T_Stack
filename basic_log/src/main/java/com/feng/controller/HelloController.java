package com.feng.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：hello
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/11/16 15:56
 */
@RestController
@Slf4j
public class HelloController {


    @RequestMapping("hello")
    public String sayHello(){
        log.info("hello,{}","world");
        return "hello";
    }
}
