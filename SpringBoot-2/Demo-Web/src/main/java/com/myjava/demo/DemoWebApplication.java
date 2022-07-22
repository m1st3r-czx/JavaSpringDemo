package com.myjava.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.mybatis.spring.annotation.MapperScan;

//@ComponentScans(value = {
//		@ComponentScan(value = "com.ewt360.services.*"),
//        @ComponentScan(value = "com.myjava.demo.controller.*")
//})
//@SpringBootApplication(scanBasePackages = "com.myjava.demo")
@SpringBootApplication
@MapperScan("com.myjava.demo.dao.mapper.*")
@ComponentScan(value = {"com.myjava.demo.*"})
public class DemoWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

}
