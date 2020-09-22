package com.soft1851.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHelloMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHelloMain.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}




