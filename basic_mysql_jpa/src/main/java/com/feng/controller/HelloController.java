package com.feng.controller;

import com.feng.domian.dataobject.UserDO;
import com.feng.domian.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @desc：hello
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/11/16 16:25
 */
@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("hello/{userId}")
    public String sayHello(@PathVariable Long userId) {
        Optional<UserDO> userDo = userRepository.findById(userId);
        return userDo.get().getName();
    }

}

