package com.soft1851.springboot.coursecenter.domain.dto;

import com.soft1851.springboot.coursecenter.domain.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/20
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    private Course course;
    private UserDto userDto;
}
