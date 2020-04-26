package com.xll.mymp.service.impl;

import com.xll.mymp.entity.Dept;
import com.xll.mymp.mapper.IDeptMapper;
import com.xll.mymp.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptMapper deptMapper;

    @Override
    public Dept selectByDeptNo(Integer deptno) {

        Dept dept = deptMapper.selectByDeptNo(deptno);

        return dept;
    }
}
