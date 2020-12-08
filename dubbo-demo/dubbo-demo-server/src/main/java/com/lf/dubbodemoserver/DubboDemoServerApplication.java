package com.lf.dubbodemoserver;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfiguration
@SpringBootApplication
public class DubboDemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoServerApplication.class, args);
    }

}
