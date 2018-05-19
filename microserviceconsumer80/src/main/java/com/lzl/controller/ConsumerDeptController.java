package com.lzl.controller;

import com.lzl.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerDeptController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String URL_PREFIX = "http://localhost:8001/";

    @RequestMapping("/dept")
    public List findAll() {
        System.out.println(restTemplate.getForObject(URL_PREFIX+"dept",List.class).toString());
        return restTemplate.getForObject(URL_PREFIX+"dept",List.class);
    }

    @RequestMapping("/dept/{id}")
    public Dept findById(@PathVariable("id")Integer id) {

        return restTemplate.getForObject(URL_PREFIX+"dept/"+id,Dept.class);
    }

    @RequestMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX+"dept",dept,boolean.class);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        return restTemplate.getForObject(URL_PREFIX+"/provider/discovery",Object.class);
    }
}
