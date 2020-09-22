package com.soft1851.cloud.study.service;

import com.soft1851.cloud.study.entity.Student;

import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */
public interface StudentService {

    List<Student> getStudentList();

    Student findById(Integer id);

    int deleteById(Integer id);
}
