package com.soft1851.springboot.coursecenter.service;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/20
 */

import com.soft1851.springboot.coursecenter.dao.CourseMapper;
import com.soft1851.springboot.coursecenter.domain.dto.CourseDto;
import com.soft1851.springboot.coursecenter.domain.dto.UserDto;
import com.soft1851.springboot.coursecenter.domain.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

    private final CourseMapper courseMapper;

    public List<Course> findAll(){
        return courseMapper.selectAll();
    }
}
