package com.zhy.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoolApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(PoolApplication.class);
        springApplication.run(args);
    }

}
