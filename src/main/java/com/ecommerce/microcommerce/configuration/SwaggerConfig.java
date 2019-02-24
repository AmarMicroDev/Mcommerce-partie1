package com.ecommerce.microcommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Produits")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ecommerce.microcommerce.web"))
                .paths(PathSelectors.regex("/Produits.*"))
                .build();
    }

    @Bean
    public Docket apiPart1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Admin")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ecommerce.microcommerce.web"))
                .paths(PathSelectors.regex("/Admin.*"))
                .build();
    }
}