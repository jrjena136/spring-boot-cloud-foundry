package com.jyoti.spring.cf.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greet")
    public String greeting(@RequestParam("name") String name, Model model) {
        String msg = "Hi " + name + "!!!, Welcome to Cloud Foundry";
        model.addAttribute("message", msg);
        return "home";
    }

}
