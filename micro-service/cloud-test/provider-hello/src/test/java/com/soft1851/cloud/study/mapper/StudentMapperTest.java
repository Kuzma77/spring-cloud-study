package com.soft1851.cloud.study.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void getStudentList() {
        System.out.println(studentMapper.getStudentList());
    }

    @Test
    public void findById(){
        Integer id = 1;
        System.out.println(studentMapper.findById(id));
    }

    @Test
    public void delectById(){
        Integer id = 4;
        System.out.println(studentMapper.deleteById(id));
    }
}
