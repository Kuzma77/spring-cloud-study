package com.soft1851.cloud.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/10
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.soft1851.cloud.study.mapper")
public class ProviderHelloMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHelloMain.class,args);
    }
}
