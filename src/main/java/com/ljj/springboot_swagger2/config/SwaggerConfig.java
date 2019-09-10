package com.ljj.springboot_swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: ljj
 * @Date: 2019/9/9 17:32
 * @Description: Swagger2配置类
 */
@Configuration
@EnableSwagger2
@Profile("dev")
public class SwaggerConfig {

    /**
     * 构建一个DocketBean
     * @return
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ljj.springboot_swagger2.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    /**
     * 构建api文档的详细信息函数
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("SpringBoot整合Swagger2")
                .description("SpringBoot整合Swagger2的描述信息")
                .version("1.0")
                .contact(new Contact("刘佳佳", null, null))
                .build();
    }
}
