package com.lzl.controller;

import com.lzl.entity.Dept;
import com.lzl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @ResponseBody
    @PostMapping("/dept")
    public String addDept(Dept dept) {
        return String.valueOf(deptService.addDept(dept));
    }

    @ResponseBody
    @GetMapping("dept")
    public String findAll() {
        return deptService.findAll().toString();
    }

    @ResponseBody
    @GetMapping("/dept/{id}")
    public String findById(@PathVariable("id")Integer id) {
        return deptService.findById(id).toString();
    }
}
