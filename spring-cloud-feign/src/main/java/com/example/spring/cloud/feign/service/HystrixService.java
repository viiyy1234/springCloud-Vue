package com.example.spring.cloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 */
@Component
public class HystrixService implements DemoServiceFeign{

    /**
     * 使用http请求（同步）会造成阻塞，阻塞后直接返回结果
     * @param message
     * @return
     */
    @Override
    public String index(String message) {
        return String.format("request bad");
    }
}
