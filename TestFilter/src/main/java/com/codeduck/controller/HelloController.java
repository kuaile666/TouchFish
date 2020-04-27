package com.codeduck.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/27
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello.....";

    }


}
