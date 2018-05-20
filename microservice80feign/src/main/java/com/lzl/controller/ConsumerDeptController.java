package com.lzl.controller;

import com.lzl.entity.Dept;
import com.lzl.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerDeptController {
    @Autowired
    private DeptClientService service;

    @PostMapping("/dept")
    public boolean addDept(Dept dept){
        return service.addDept(dept);
    }

    @GetMapping("/dept")
    public List<Dept> findAll(){
        return service.findAll();
    }

    @GetMapping("/dept/{id}")
    public Dept findById(@PathVariable("id")Integer id){
        return service.findById(id);
    }
}
