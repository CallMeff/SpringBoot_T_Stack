package com.feng.basic.controller;

import com.feng.basic.domain.vo.HellosVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value = "hellos")
    public void helloList(@RequestBody HellosVO hellosVO){
        String appId = hellosVO.getAppId();
        List<String> videoIdList = hellosVO.getVideoIds();
        System.out.println(videoIdList.size());
    }

}
