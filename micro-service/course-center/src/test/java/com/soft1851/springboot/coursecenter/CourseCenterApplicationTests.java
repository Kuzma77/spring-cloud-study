package com.soft1851.springboot.coursecenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootTest
@MapperScan("com.soft1851.springboot.coursecenter.dao")
class CourseCenterApplicationTests {

    @Test
    void contextLoads() {
    }

}
