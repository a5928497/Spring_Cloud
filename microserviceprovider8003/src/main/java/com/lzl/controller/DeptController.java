package com.lzl.controller;

import com.lzl.entity.Dept;
import com.lzl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @ResponseBody
    @PostMapping("/dept")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @ResponseBody
    @GetMapping("/dept")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    @ResponseBody
    @GetMapping("/dept/{id}")
    public Dept findById(@PathVariable("id")Integer id) {
        return deptService.findById(id);
    }
}
