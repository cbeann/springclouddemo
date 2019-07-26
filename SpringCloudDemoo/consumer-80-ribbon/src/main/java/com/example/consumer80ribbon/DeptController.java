package com.example.consumer80ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CBeann
 * @create 2019-07-25 12:21
 */

@RestController
public class DeptController {


    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @RequestMapping("/dept/get/{id}")
    public String getDept(@PathVariable("id") String id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/get/"+id,String.class);
    }
}
