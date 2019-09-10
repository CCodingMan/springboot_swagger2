package com.ljj.springboot_swagger2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @author: ljj
 * @Date: 2019/9/9 18:05
 * @Description:
 */
@Data
@Builder
@ApiModel
public class UserEntity {
    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户名称")
    private String name;
    @ApiModelProperty(value = "用户性别")
    private String sex;
    @ApiModelProperty(value = "用户年龄")
    private int age;

    @Tolerate
    public UserEntity() {
    }
}
