package com.feng.domian.service;

import com.feng.domian.dataobject.UserDO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @desc：用户JPA实现类
 * @title：UserRepository
 * @author: tianfengluyao
 * @date: 2018/11/16 16:36
 */
public interface UserRepository extends JpaRepository<UserDO, Long> {

}
