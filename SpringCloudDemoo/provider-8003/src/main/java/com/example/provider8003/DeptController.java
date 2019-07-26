package com.example.provider8003;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2019-07-25 12:11
 */
@RestController
public class DeptController {

    @RequestMapping("/get/{id}")
    public String getDept(@PathVariable("id") String id){
        return "provider-8003  id:"+id;
    }
}
