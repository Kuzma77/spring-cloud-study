package com.soft1851.cloud.study.handler;

import com.soft1851.cloud.study.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */

@RestController
@RequestMapping("/consumer")
public class StudentHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/student/one")
    public Student getOneStudent(){
        return restTemplate.getForObject("http://kuzma.com:8001/student/one", Student.class);
    }

    @GetMapping("/student/list")
    public List<Student> getStudentList(){
        return restTemplate.getForObject("http://kuzma.com:8001/student/list", List.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return restTemplate.getForObject("http://kuzma.com:8001/student/findById/{id}", Student.class,id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
         restTemplate.delete("http://kuzma.com:8001/student/deleteById/{id}",id);
    }
}
