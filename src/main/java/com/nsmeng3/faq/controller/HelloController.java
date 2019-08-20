package com.nsmeng3.faq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(@RequestParam(name = "hello", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
}