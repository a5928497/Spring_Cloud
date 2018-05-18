package com.lzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider8001_APP {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001_APP.class,args);
    }
}
