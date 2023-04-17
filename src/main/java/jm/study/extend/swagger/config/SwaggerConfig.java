package jm.study.extend.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket group1() {
        return new Docket(DocumentationType.OAS_30)
                .useDefaultResponseMessages(true)
                .groupName("group1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("jm.study.extend.swagger"))
                .paths(PathSelectors.ant("/v1/api/**"))
                .build()
                .apiInfo(apiInfo());
    }

    @Bean
    public Docket group2() {
        return new Docket(DocumentationType.OAS_30)
                .useDefaultResponseMessages(true)
                .groupName("group2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("jm.study.extend.swagger"))
                .paths(PathSelectors.ant("/v2/api/**"))
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Test")
                .description("SwaggerConfig")
                .version("3.0")
                .build();
    }

}