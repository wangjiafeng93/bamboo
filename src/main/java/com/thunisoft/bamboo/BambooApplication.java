package com.thunisoft.bamboo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@EnableCaching
@MapperScan({"com.thunisoft.bamboo.mapper"})
@SpringBootApplication
public class BambooApplication {

    public static void main(String[] args) {
        SpringApplication.run(BambooApplication.class, args);
    }

}
