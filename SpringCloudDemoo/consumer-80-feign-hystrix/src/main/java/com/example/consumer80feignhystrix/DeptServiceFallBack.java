package com.example.consumer80feignhystrix;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author CBeann
 * @create 2019-07-25 12:43
 */
@Component
public class DeptServiceFallBack implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public String getDept(String id) {
                return "sory,i'm sory";
            }
        };
    }
}
