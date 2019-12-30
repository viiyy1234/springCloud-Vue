package com.example.spring.cloud.feign.service;

 import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-demo" ,fallback = HystrixService.class)//调用服务
public  interface DemoServiceFeign {

    @RequestMapping(value = "index")
    public String index(@RequestParam(value = "message")String message);
}
