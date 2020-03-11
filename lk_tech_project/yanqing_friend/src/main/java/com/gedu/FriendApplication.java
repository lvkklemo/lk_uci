package com.gedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gedu.dao")
@EnableScheduling
/** 开启 Feign 扫描支持 */
@EnableFeignClients
@EnableDiscoveryClient
public class FriendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FriendApplication.class,args);
    }
}
