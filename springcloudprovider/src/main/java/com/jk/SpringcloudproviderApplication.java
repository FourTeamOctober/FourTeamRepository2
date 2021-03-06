package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //声明当前服务为eureka的客户端
@MapperScan(value = {"com.jk.mapper"})
public class SpringcloudproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudproviderApplication.class, args);
    }
}
