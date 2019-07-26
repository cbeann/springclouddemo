package com.example.provider8001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2019-07-26 12:35
 */
@RestController
public class GatewayController{

    @RequestMapping("/mypath/get/method1")
    public String method1(){
    return "/mypath/get/metoid1";
    }


}
