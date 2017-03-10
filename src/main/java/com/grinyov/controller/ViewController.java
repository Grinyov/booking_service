package com.grinyov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by vgrinyov.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Unknown");
        model.addAttribute("mode", "development");
        return "index";
    }

}
