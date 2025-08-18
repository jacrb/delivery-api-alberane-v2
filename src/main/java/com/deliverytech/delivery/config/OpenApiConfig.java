package com.deliverytech.delivery.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    

    public OpenAPI customOpenAPI(){
        return new OpenAPI()
        .info(new Info()
            .title("Delivery API - SEU_NOME")
            .version("0.1.0")
            .description("API para sistemas de Delivery")
            .contact(new Contact()
                .name("Delivery Tech - Suporte")
                .email("suporte@site.com.br")));
    }
}
