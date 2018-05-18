package com.lzl.service;

import com.lzl.entity.Dept;

import java.util.List;

public interface DeptService {
    public Dept findById(Integer id);

    public boolean addDept(Dept dept);

    public List<Dept> findAll();
}
