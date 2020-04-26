package com.xll.mymp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 */
@Data
@TableName("depy")
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;
    private List<Emp> empList;
}
