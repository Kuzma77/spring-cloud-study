package com.soft1851.springboot.usercenter.service;

import com.soft1851.springboot.usercenter.domain.dto.UserDto;
import com.soft1851.springboot.usercenter.domain.entity.User;
import com.soft1851.springboot.usercenter.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/29
 */
public interface UserService {


    /**
     * 根据id获得用户详情
     * @param id
     * @return
     */
    User findById(Integer id);
}
