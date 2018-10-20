package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient //eurake客户端
@EnableDiscoveryClient //服务发现
@EnableFeignClients //feign相关注解
public class SpringcloudfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudfeignApplication.class, args);
    }
}
