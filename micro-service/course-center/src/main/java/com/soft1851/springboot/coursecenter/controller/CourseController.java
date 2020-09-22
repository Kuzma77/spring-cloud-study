package com.soft1851.springboot.coursecenter.controller;

import com.soft1851.springboot.coursecenter.domain.dto.CourseDto;
import com.soft1851.springboot.coursecenter.domain.dto.UserDto;
import com.soft1851.springboot.coursecenter.domain.entity.Course;

import com.soft1851.springboot.coursecenter.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/18
 */


@RestController
@RequestMapping(value = "/course")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {

    private final RestTemplate restTemplate;


    private final CourseService courseService;
    @GetMapping(value = "/all")
    public List<CourseDto> getAllCourse(){
        List<Course> courses = courseService.findAll();
        List<CourseDto> courseDtoList = new ArrayList<>();
        courses.forEach(course -> {
            System.out.println(course.getCourseName());
            UserDto userDto =restTemplate.getForObject("http://101.200.82.237:8081/user/{id}",UserDto.class,course.getUserId());
            assert userDto !=null;
            CourseDto courseDto = CourseDto.builder().course(course).userDto(userDto).build();
            courseDtoList.add(courseDto);
        });
        return courseDtoList;
    }
}
