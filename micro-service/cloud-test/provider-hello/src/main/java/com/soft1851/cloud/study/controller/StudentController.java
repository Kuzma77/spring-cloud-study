package com.soft1851.cloud.study.controller;

import com.soft1851.cloud.study.entity.Student;
import com.soft1851.cloud.study.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentMapper studentMapper;

    @GetMapping(value = "/one")
    public Student getOneStudent(){
        return new Student(101,"Tom");
    }

    @GetMapping(value = "/list")
    public List<Student> getStudentList(){
        System.out.println(studentMapper.getStudentList());
        return studentMapper.getStudentList();
    }

    @GetMapping(value = "/findById/{id}")
    public Student findById(@PathVariable("id") Integer id){
        System.out.println(studentMapper.findById(id));
        return studentMapper.findById(id);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public int deleteById(@PathVariable("id") Integer id){
        return studentMapper.deleteById(id);
    }
}
