package com.example.consumer80feignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients(basePackages= {"com.example"})
public class Consumer80FeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Consumer80FeignHystrixApplication.class, args);
    }

}
