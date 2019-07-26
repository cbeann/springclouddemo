package com.example.provider8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider8003Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8003Application.class, args);
    }

}
