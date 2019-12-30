package com.example.spring.cloud.ribbon.controller;

import com.example.spring.cloud.ribbon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "index")
    public String index(String message){
        return demoService.sayHi(message);
    }

}
