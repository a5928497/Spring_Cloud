package com.lzl.service;

import com.lzl.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public boolean addDept(Dept dept) {
                return false;
            }

            public List<Dept> findAll() {
                return null;
            }

            public Dept findById(Integer id) {
                return new Dept().setId(id).setDeptName("服务器跪了,").setDbSource("迟点来吧");
            }
        };
    }
}
