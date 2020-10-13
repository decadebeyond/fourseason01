package com.decademo.fourseason01;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.decademo.fourseason01.dao")
public class Fourseason01Application {

    public static void main(String[] args) {
        SpringApplication.run(Fourseason01Application.class, args);
    }

}
