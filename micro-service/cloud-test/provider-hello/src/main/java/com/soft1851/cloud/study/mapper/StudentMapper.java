package com.soft1851.cloud.study.mapper;

import com.soft1851.cloud.study.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/14
 */
public interface StudentMapper {
    /**
     *
     * 获取所有学生信息
     * @return
     */
    @Select("Select * FROM student")
    List<Student> getStudentList();

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM student WHERE student_id=#{id}")
    Student findById(Integer id);

    /**
     * 通过id删除学生
     * @param id
     */
    @Delete("DELETE FROM student WHERE student_id=#{id}")
    int deleteById(Integer id);
}
