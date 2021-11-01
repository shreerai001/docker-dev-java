package com.shree.demo3.controller;

import com.shree.demo3.model.Programmer;
import com.shree.demo3.repo.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/programmer")
public class ProgrammerController {

    private final ProgrammerRepository programmerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ProgrammerController(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    @PostMapping
    public String saveProgrammer(final Programmer programmer) {
        return programmerRepository.save(programmer).getFullName();
    }

    @GetMapping
    public String getTechStack() {
        return restTemplate.getForObject("http://localhost:8082", String.class) + "Here";
    }

}
