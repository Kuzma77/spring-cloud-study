package com.soft1851.springboot.contentcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/29
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Integer id;

    private String wxId;

    private String wxNickName;

    private String roles;

    private String avatarUrl;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Integer bonus;
}
