package com.feng;

import com.feng.filter.FristFilter;
import com.feng.filter.SecondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@ServletComponentScan
public class BasicFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicFilterApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean getFristFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new FristFilter());
        registration.addUrlPatterns("/hello");
        registration.setName("fristFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean getCharacterEncodingFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SecondFilter());
        registration.addUrlPatterns("/hello");
        registration.setName("secondFilter");
        registration.setOrder(2);
        return registration;
    }


}
