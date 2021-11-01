package com.shree.tech.controller;

import com.shree.tech.model.Stack;
import com.shree.tech.repository.StackRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechController {

    private final StackRepository stackRepository;

    public TechController(StackRepository stackRepository) {
        this.stackRepository = stackRepository;
    }

    @GetMapping
    public String getTech() {
        stackRepository.save(new Stack("Java", "Backend"));
        return "Hello Hi";
    }

    @GetMapping("/namaste")
    public String test() {
        return "Namaste";
    }
}
