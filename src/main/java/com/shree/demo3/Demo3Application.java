package com.shree.demo3;


import com.shree.demo3.model.Programmer;
import com.shree.demo3.repo.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;


@PropertySource(factory = YamlPropertySourceFactory.class,
        value = {
                "file:${catalina.home}/conf/config/application-${spring.profiles.active}.yml"
        }
)
@SpringBootApplication
public class Demo3Application extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Demo3Application.class);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }



}
