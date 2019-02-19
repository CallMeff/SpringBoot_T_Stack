package com.feng.service;

import com.feng.model.dto.StudentDTO;
import com.feng.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @desc：hello service
 * @title：HelloService
 * @author: tianfengluyao
 * @date: 2019/2/19 11:04
 */
@Service
public class HelloService {
    @Resource
    private RedisUtil<String, String> redisUtil;

    public Map<String, String> getObjectFromRedis(){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName("lirry");
        studentDTO.setAge(10);
        studentDTO.setGrade("四年级");

        redisUtil.hashPut("student_lirry","name",studentDTO.getName());
        redisUtil.hashPut("student_lirry","age", String.valueOf(studentDTO.getAge()));
        redisUtil.hashPut("student_lirry","grade",studentDTO.getGrade());


        return redisUtil.hashFindAll("student_lirry");
    }

}
