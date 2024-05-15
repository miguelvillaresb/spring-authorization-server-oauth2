package com.authorization.config;

import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OpenApiConfig {

    @Bean
    @Primary
    SwaggerUiConfigProperties swaggerUiConfig() {
        final SwaggerUiConfigProperties swaggerUiConfigProperties = new SwaggerUiConfigProperties();
        swaggerUiConfigProperties.setShowCommonExtensions(true);
        swaggerUiConfigProperties.setPath("/");
        swaggerUiConfigProperties.setDisableSwaggerDefaultUrl(true);
        return swaggerUiConfigProperties;
    }
}
