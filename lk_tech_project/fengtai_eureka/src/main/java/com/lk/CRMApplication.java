package com.lk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CRMApplication {
    public static void main(String[] args) {
        SpringApplication.run(CRMApplication.class,args);
    }
}
