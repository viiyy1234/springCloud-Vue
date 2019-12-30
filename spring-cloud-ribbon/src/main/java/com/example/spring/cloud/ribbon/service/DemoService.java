package com.example.spring.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexError") //熔断回调方法:连接失败调用indexError方法
    public String sayHi(String message){
        return restTemplate.getForObject("http://spring-cloud-demo/index?message=" + message,String.class);
    }

    public String indexError(String message){
        return String.format("request bad");
    }
}
