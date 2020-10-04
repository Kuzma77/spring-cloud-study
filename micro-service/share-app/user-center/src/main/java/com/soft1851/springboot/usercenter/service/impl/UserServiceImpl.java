package com.soft1851.springboot.usercenter.service.impl;

import com.soft1851.springboot.usercenter.domain.entity.User;
import com.soft1851.springboot.usercenter.mapper.UserMapper;
import com.soft1851.springboot.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/29
 */

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    @Override
    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
