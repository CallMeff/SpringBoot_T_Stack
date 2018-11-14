package com.feng.mapper;

import com.feng.model.dataobject.UserDO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}