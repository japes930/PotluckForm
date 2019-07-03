package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //tells springboot how to use (this controller as remote control)
public class HomeController {

    @RequestMapping("/index") //when user requests this page

    public String homePage(){
        return "index";
    }
}
