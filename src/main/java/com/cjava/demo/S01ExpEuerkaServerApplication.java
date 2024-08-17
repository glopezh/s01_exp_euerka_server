package com.cjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class S01ExpEuerkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(S01ExpEuerkaServerApplication.class, args);
    }

}
