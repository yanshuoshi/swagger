package com.swagger.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author Shuoshi.Yan
 * @package:com.swagger.demo.config
 * @className:swagger配置类
 * @description:
 * @date 2019-12-04 15:23
 * @version:V1.0
 * @NOTICE：本内容仅限于xxx有限公司内部传阅,禁止外泄以及用于其他的商业项目
 * @ Copyright  xxx. All rights reserved.
 **/
@Configuration
//开启swagger
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        //版本类型是swagger2
        return new Docket(DocumentationType.SWAGGER_2)
                //通过调用自定义方法apiInfo，获得文档的主要信息
                .apiInfo(apiInfo())
                .select()//通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现
                .apis(RequestHandlerSelectors.basePackage("com.swagger.demo.controller"))//扫描该包下面的API注解
                .paths(PathSelectors.any())
                .build();
    }
    //API相关信其他息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口服务文档") //接口管理文档首页显示
                .description("接口服务文档")//API的描述
               // .termsOfServiceUrl("www.baidu.com")//网站url等
                .version("1.0")
                .build();
    }
}
