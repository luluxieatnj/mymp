package com.xll.mymp.service.impl;

import com.xll.mymp.entity.Emp;
import com.xll.mymp.mapper.IEmpMapper;
import com.xll.mymp.service.IEmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private IEmpMapper empMapper;

    @Override
    public Emp getEmpById(Integer empNo) {

        // 没有一对一
//        Emp emp = empMapper.selectByEmpno(empNo);

        // 一对一映射关系
        Emp emp = empMapper.selectByEmpno2(empNo);

        log.info("getEmpById, empno = {}", empNo);

        return emp;
    }
}
