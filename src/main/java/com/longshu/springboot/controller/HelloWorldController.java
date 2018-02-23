package com.longshu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxinlong
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "hello world !";
    }

}
