package com.imooc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author CBeann
 * @create 2019-07-22 9:18
 */

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
