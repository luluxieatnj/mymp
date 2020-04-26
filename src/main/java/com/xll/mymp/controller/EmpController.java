package com.xll.mymp.controller;

import com.xll.mymp.entity.Emp;
import com.xll.mymp.service.IEmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private IEmpService empService;
    /**
     *   localhost:8080/emp/getById/7369
     */
    @GetMapping("/getById/{empno}")
    public Emp getById(@PathVariable("empno")Integer empno) {

        log.info("EmpController.getById, enpno = {}", empno);

        Emp empById = empService.getEmpById(empno);

        return empById;
    }

}
