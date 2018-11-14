package com.feng.basic;

import com.feng.basic.controller.HelloController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {

    @Resource
    private HelloController helloController;

    @Test
    public void contextLoads() {
        Assert.assertEquals(helloController.sayHello(),"hello,springboot");
    }

}
