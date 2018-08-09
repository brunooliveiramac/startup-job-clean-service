package com.clean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableEurekaClient
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.clean.configuration")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
