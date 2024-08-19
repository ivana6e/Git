package com.example.git0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @GetMapping("/home")
    public String home() {
        return "git0 home";
    }
}
