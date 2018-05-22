package com.lzl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Value("${server.port}")
    private String port;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaZone;
    @Value("${spring.application.name}")
    private String name;


    @GetMapping("/config")
    @Override
    public String toString() {
        return "RestController{" +
                "port='" + port + '\'' +
                ", eurekaZone='" + eurekaZone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
