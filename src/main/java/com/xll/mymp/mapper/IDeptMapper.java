package com.xll.mymp.mapper;

import com.xll.mymp.entity.Dept;
import org.apache.ibatis.annotations.Param;

public interface IDeptMapper {

    /* 根据deptno查询一对多 */
    Dept selectByDeptNo(@Param("deptno") Integer deptno);

}
