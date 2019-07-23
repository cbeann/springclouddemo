package com.imooc.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author CBeann
 * @create 2019-07-22 8:30
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7001_config_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServer7001_config_App.class, args);
    }
}

