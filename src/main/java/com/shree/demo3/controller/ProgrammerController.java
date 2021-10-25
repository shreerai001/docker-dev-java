package com.shree.demo3.controller;

import com.shree.demo3.model.Programmer;
import com.shree.demo3.repo.ProgrammerRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programmer")
public class ProgrammerController {

    private final ProgrammerRepository programmerRepository;

    public ProgrammerController(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    @PostMapping
    public String saveProgrammer(final Programmer programmer) {
        return programmerRepository.save(programmer).getFullName();
    }
}
