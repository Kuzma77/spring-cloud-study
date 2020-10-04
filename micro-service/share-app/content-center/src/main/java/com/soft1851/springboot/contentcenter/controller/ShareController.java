package com.soft1851.springboot.contentcenter.controller;

import com.soft1851.springboot.contentcenter.domain.dto.ShareDto;
import com.soft1851.springboot.contentcenter.domain.dto.UserDto;
import com.soft1851.springboot.contentcenter.domain.entity.Share;
import com.soft1851.springboot.contentcenter.service.ShareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wl_sun
 * @description TODO
 * @Data 2020/9/28
 */
@RestController
@RequestMapping(value = "/share")
@Api(tags = "分享接口",value = "提供分享相关的Rest API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareController {

    private final ShareService shareService;
   // private final RestTemplate restTemplate;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "通过id查询",notes = "通过id查询")
    public ShareDto findById(@PathVariable Integer id){
        return this.shareService.findById(id);
    }

    @GetMapping(value = "/query")
    @ApiOperation(value = "分享列表",notes = "分享列表")
    public List<Share> query(
        @RequestParam(required = false) String title,
        @RequestParam(required = false,defaultValue = "1") Integer pageNo,
        @RequestParam(required = false,defaultValue = "10") Integer pageSize,
        @RequestParam(required = false) Integer userId) throws Exception{
        if(pageSize > 100){
            pageSize = 100;
        }
        return this.shareService.query(title,pageNo,pageSize,userId).getList();
    }
}