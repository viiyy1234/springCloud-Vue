package com.example.spring.cloud.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSystemApplication.class, args);
    }

}
