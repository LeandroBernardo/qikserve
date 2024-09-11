package com.qikserve.paymentsystem.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product and Promotion API - QIK SERVE")
                        .version("1.0")
                        .description("This is an API for managing products and their associated promotions.")
                        .termsOfService("https://qikserve.com/about-restaurant-ordering-system-solutions/")
                        .contact(new Contact()
                                .name("Dev Team")
                                .email("leandro.bernardos@gmail.com")
                                .url("https://qikserve.com/contact/"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")));
    }
}
