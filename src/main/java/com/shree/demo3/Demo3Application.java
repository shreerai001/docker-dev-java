package com.shree.demo3;


import com.shree.demo3.model.Programmer;
import com.shree.demo3.repo.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;


@PropertySource(factory = YamlPropertySourceFactory.class,
        value = {
                "file:${catalina.home}/conf/config/application-${spring.profiles.active}.yml"
        }
)
@SpringBootApplication
public class Demo3Application extends SpringBootServletInitializer
        implements CommandLineRunner {

    @Autowired
    private ProgrammerRepository programmerRepository;


    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Demo3Application.class);
    }

    private void test() {
        programmerRepository.save(new Programmer("Shree", "Scala"));
        System.out.println("saved");
    }

    @Override
    public void run(String... args) throws Exception {
        test();
    }


}
