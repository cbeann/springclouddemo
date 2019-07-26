package com.example.configclienteureka789001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigClientEureka789001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEureka789001Application.class, args);
    }

}
