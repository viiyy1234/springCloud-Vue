package com.example.spring.cloud.feign.controller;

import com.example.spring.cloud.feign.service.DemoServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerFeign {

    @Autowired
    private DemoServiceFeign demoServiceFeign;

    @RequestMapping(value = "index")
    public String index(String message){
        return demoServiceFeign.index(message);
    }
}
