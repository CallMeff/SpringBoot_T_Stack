package com.feng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.feng.mapper")
public class BasicMysqlMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicMysqlMybatisApplication.class, args);
    }
}
