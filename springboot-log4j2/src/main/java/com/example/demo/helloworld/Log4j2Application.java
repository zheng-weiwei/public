package com.example.demo.helloworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo.helloworld.dao")
@SpringBootApplication
public class Log4j2Application {

    public static void main(String[] args) {
        SpringApplication.run(Log4j2Application.class, args);
    }

}
