package com.xll.mymp.mapper;

import com.xll.mymp.entity.Emp;

/**
 *  使用 mybatis，  不继承BaseMapper（mybatis-plus）
 */
public interface IEmpMapper {

    // 简单查询emp，对应的dept 不查询
    Emp selectByEmpno(Integer empno);

    // 一对一关系，
    Emp selectByEmpno2(Integer empno);

}
