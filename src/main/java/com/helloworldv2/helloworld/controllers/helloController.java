package com.helloworldv2.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping("/hello")
    public void  hello(Model model){
        String message = "hello World from version 2!!!";
        model.addAttribute("messageTag", message);
    }
}