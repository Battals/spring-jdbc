package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontPageController {
    @GetMapping("/")
    public String forside(){
        return "index";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}