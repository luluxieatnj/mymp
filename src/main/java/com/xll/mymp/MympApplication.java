package com.xll.mymp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xll.mymp.mapper")  // 扫描 mapper 接口所在包
public class MympApplication {

    public static void main(String[] args) {
        SpringApplication.run(MympApplication.class, args);
    }

}
