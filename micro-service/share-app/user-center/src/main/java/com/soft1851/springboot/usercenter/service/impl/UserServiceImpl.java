package com.soft1851.springboot.usercenter.service.impl;

import com.soft1851.springboot.usercenter.domain.dto.UserAddBonusMsgDto;
import com.soft1851.springboot.usercenter.domain.entity.BonusEventLog;
import com.soft1851.springboot.usercenter.domain.entity.User;
import com.soft1851.springboot.usercenter.mapper.BonusEventLogMapper;
import com.soft1851.springboot.usercenter.mapper.UserMapper;
import com.soft1851.springboot.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
    private final BonusEventLogMapper bonusEventLogMapper;
    @Override
    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User addBonusById(UserAddBonusMsgDto userAddBonusMsgDto) {
        User user = userMapper.selectByPrimaryKey(userAddBonusMsgDto.getUserId());
        user.setBonus(user.getBonus() + userAddBonusMsgDto.getBonus());
        this.userMapper.updateByPrimaryKeySelective(user);

        //2、写积分日志
        this.bonusEventLogMapper.insert(BonusEventLog.builder()
                .userId(user.getId())
                .value(userAddBonusMsgDto.getBonus())
                .event("CONTRIBUTE")
                .createTime(LocalDateTime.now())
                .description("投稿加积分")
                .build());
        return user;
    }
}
