package com.example.provider8001;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2019-07-25 11:49
 */
@RestController
public class DeptController {

    //for eureka
    @RequestMapping("/get/{id}")
    public String getDept(@PathVariable("id") String id){
        return "provider-8001  id:"+id;
    }

    //for geteway
    @RequestMapping("/get1/{id}")
    public String getDept1(@PathVariable("id") String id){
        return "provider-8001  id:"+id;
    }
}
