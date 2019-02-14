package com.feng.service;

import com.feng.excetion.BusinessException;
import org.springframework.stereotype.Service;

/**
 * @desc：say hello service
 * @title：HelloService
 * @author: tianfengluyao
 * @date: 2019/2/14 15:29
 */
@Service
public class HelloService {


    public String sayHelloWithEnglish(){
        System.out.println("hello");
        return "hello";
    }

    public String sayHelloWithChinese(){
        System.out.println("你好");
        //抛出业务异常
        if(true) {
            throw new BusinessException("1", "吃太饱了", "xxx");
        }
        return "你好";
    }


}
