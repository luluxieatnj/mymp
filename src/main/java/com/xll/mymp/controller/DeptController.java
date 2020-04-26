package com.xll.mymp.controller;

import com.xll.mymp.entity.Dept;
import com.xll.mymp.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    /**
     *   localhost:8080/dept/getByDeptNo/20
     */
    @GetMapping("/getByDeptNo/{deptno}")
    public Dept getByDeptNo(@PathVariable("deptno") Integer deptno) {

        Dept dept = deptService.selectByDeptNo(deptno);
        return dept;
    }

}
