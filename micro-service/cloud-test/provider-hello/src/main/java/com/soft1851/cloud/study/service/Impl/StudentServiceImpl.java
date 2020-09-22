package com.soft1851.cloud.study.service.Impl;

import com.soft1851.cloud.study.entity.Student;
import com.soft1851.cloud.study.mapper.StudentMapper;
import com.soft1851.cloud.study.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return studentMapper.deleteById(id);
    }
}
