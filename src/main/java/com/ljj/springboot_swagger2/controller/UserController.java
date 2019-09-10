package com.ljj.springboot_swagger2.controller;

import com.ljj.springboot_swagger2.entity.UserEntity;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ljj
 * @Date: 2019/9/9 17:57
 * @Description:
 */
@RestController
@Api(tags = "用户管理相关接口")
public class UserController {

    @GetMapping("/getUserInfo")
    @ApiOperation("查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sex", value = "性别", defaultValue = "男"),
            @ApiImplicitParam(name = "age", value = "年龄", defaultValue = "20")
    })
    @ApiResponses({
            @ApiResponse(code = 404, message = "请求走丢了"),
            @ApiResponse(code = 500, message = "服务器出问题")
    })
    public UserEntity getUserInfo(String sex, int age){
        UserEntity user = UserEntity.builder().id(1L).name("ljj").sex("男").age(20).build();
        return user;
    }
}
