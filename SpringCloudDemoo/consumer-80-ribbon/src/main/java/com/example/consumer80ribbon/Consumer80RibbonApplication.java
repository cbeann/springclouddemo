package com.example.consumer80ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Consumer80RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Consumer80RibbonApplication.class, args);
    }

}
