package com.example.consumer80feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.example"})
public class Consumer80FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Consumer80FeignApplication.class, args);
    }

}
