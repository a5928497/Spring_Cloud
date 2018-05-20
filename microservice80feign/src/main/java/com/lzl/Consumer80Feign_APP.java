package com.lzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lzl"})
@ComponentScan("com.lzl")
public class Consumer80Feign_APP {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80Feign_APP.class,args);
    }
}
