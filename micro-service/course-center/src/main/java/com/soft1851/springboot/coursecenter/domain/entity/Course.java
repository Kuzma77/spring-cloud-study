package com.soft1851.springboot.coursecenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/18
 */

@Table(name = "course")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "finished")
    private Boolean finished;

    @Column(name = "class_name")
    private String className;

    @Column(name = "user_id")
    private Integer userId;
}
