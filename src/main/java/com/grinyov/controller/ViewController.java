package com.grinyov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.DocFlavor;

/**
 * Created by vgrinyov.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
