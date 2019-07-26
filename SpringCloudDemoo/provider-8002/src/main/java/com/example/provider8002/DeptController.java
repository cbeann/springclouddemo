package com.example.provider8002;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2019-07-25 12:11
 */
@RestController
public class DeptController {

    //for eureka
    @RequestMapping("/get/{id}")
    public String getDept(@PathVariable("id") String id){
        return "provider-8002  id:"+id;
    }

    //for geteway
    @RequestMapping("/get2/{id}")
    public String getDept1(@PathVariable("id") String id){
        return "provider-8002  id:"+id;
    }
}
