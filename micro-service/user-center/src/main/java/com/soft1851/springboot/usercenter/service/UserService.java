package com.soft1851.springboot.usercenter.service;

import com.soft1851.springboot.usercenter.dao.UserMapper;
import com.soft1851.springboot.usercenter.domain.dto.UserDto;
import com.soft1851.springboot.usercenter.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/20
 */

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserMapper userMapper;

    public UserDto getUserDto(int id){
        User user = userMapper.selectByPrimaryKey(id);
        return UserDto.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .avatarUrl(user.getAvatarUrl())
                .build();
    }
}
