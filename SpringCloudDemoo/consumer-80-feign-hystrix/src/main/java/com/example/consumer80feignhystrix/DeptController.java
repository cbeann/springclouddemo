package com.example.consumer80feignhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2019-07-25 12:29
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept/get/{id}")
    public String getDept(@PathVariable("id") String id){

        return deptService.getDept(id);
    }
}
