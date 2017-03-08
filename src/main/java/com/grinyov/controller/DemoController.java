package com.grinyov.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vgrinyov.
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
