package com.example.zipkinservicea;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2019-07-25 16:15
 */
@RestController
public class AController {

    @RequestMapping("/get")
    public String getDept(){
        return "zipkinservice-A  ---------->";
    }

}
