package com.feng.service;

import com.feng.constant.UserConstant;
import com.feng.mapper.UserDOMapper;
import com.feng.model.dataobject.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @desc：hello service
 * @title：HelloService
 * @author: tianfengluyao
 * @date: 2018/11/14 11:35
 */
@Service
public class HelloService {

    @Resource
    private UserDOMapper userDOMapper;

    public String userSayHello(int userId){
        UserDO userDO = userDOMapper.selectByPrimaryKey(userId);
        String languageCode = userDO.getLanguage();
        return UserConstant.LanguageEnum.getSayHelloWord(languageCode);
    }

}
