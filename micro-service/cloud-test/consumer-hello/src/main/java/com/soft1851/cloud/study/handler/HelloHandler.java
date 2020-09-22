package com.soft1851.cloud.study.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */

@RestController
@RequestMapping("/consumer")
public class HelloHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String getHello(){
        return restTemplate.getForObject("http://kuzma.com:8001/hello",String.class);
    }
}
