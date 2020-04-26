package com.xll.mymp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     *   localhost:8080/test/hello
     */
    @GetMapping("/hello")
    public String test() {
        log.info("--- hello --- world! ---");
        return "hello world!";
    }

}
