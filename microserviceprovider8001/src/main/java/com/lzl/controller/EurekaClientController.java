package com.lzl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EurekaClientController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @ResponseBody
    @GetMapping("/provider/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println(list);
        List<ServiceInstance> insList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance si:insList) {
            System.out.println(si.getHost() +"," + si.getServiceId() +"," +si.getPort() +"," +si.getUri() +"," +si.getMetadata());
        }
        return this.discoveryClient;
    }
}
