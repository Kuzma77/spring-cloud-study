package com.soft1851.springboot.usercenter.controller;

import com.soft1851.springboot.usercenter.domain.dto.UserAddBonusMsgDto;
import com.soft1851.springboot.usercenter.domain.dto.UserDto;
import com.soft1851.springboot.usercenter.domain.entity.User;
import com.soft1851.springboot.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/29
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;


    @GetMapping(value = "/{id}")
    public User findUserById(@PathVariable Integer id){
        log.info("我被调用了....");
        return userService.findById(id);
    }

    @GetMapping("/q")
    public User query(User user){
        return user;
    }

    @PostMapping("/addBonus")
    public UserAddBonusMsgDto addBonusById(@RequestBody  UserAddBonusMsgDto userAddBonusMsgDto){
         userService.addBonusById(userAddBonusMsgDto);
        System.out.println("通过feign调用加积分");
         return userAddBonusMsgDto;
    }
}