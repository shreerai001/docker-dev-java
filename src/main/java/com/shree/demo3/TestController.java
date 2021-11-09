package com.shree.demo3;


import com.shree.demo3.model.Programmer;
import com.shree.demo3.model.TestResponse;
import com.shree.demo3.repo.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TestController {

    private final ProgrammerRepository programmerRepository;

    public TestController(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    @Value("${test-string}")
    private String testString;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public TestResponse helloWorld() {
        TestResponse testResponse = new TestResponse();
        testResponse.setMessage("Hello there the angel from the nightmare.. asdfasdf" + testString);
        return testResponse;
    }

    @GetMapping("/test")
    public String helloWorldd() {
        return "Hello there the angel from the nightmare.......doing.....sdfasd.asdfasdf";
    }

    @GetMapping("/testt")
    public List<Programmer> getAllProgrammer() {
        return programmerRepository.findAll();
    }

}
