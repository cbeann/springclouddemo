package com.example.consumer80feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author CBeann
 * @create 2019-07-25 12:28
 */

@FeignClient(value = "PROVIDER")
public interface DeptService {
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String getDept(@PathVariable("id") String id);

}