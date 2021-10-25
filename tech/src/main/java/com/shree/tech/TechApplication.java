package com.shree.tech;

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
public class TechApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TechApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TechApplication.class);
    }



}
