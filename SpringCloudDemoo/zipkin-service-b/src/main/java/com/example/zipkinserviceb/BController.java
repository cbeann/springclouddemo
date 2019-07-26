package com.example.zipkinserviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CBeann
 * @create 2019-07-25 16:20
 */
@RestController
public class BController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public String getDept(){
        String result = restTemplate.getForObject("http://localhost:8988/get",String.class);
        return result+"zipkinservice-B ---------->";
    }
}
