package com.lzl.service.impl;

import com.lzl.dao.DeptDao;
import com.lzl.entity.Dept;
import com.lzl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    public Dept findById(Integer id) {
        return deptDao.findById(id);
    }

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
