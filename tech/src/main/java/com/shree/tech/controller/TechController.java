package com.shree.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechController {
    @GetMapping
    public String getTech() {
        return "Hello";
    }
}
