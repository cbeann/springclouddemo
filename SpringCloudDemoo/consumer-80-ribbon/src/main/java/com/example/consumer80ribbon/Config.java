package com.example.consumer80ribbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author CBeann
 * @create 2019-07-25 12:18
 */
@Configuration
public class Config {

    @Bean
    @LoadBalanced//重点，重点，重点
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
