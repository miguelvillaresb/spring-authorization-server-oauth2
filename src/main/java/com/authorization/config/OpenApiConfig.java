package com.authorization.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * OpenAPI Configuration.
 */
@Configuration
@SecurityScheme(type = SecuritySchemeType.HTTP, name = "basicAuth", scheme = "basic")
@SecurityScheme(type = SecuritySchemeType.HTTP, name = "tokenAuth", scheme = "bearer", bearerFormat = "JWT")
@OpenAPIDefinition(info = @Info(title = "${spring.application.name}", version = "${app.version}", description = "${springdoc.api.description}", license = @License(name = "${springdoc.api.license.name}", url = "${springdoc.api.license.url}")), security = {
        @SecurityRequirement(name = "basicAuth"), @SecurityRequirement(name = "tokenAuth") })
public class OpenApiConfig {

    @Bean
    @Primary
    SwaggerUiConfigProperties swaggerUiConfig() {
        // For details, see https://springdoc.org/#swagger-ui-properties
        final SwaggerUiConfigProperties swaggerUiConfigProperties = new SwaggerUiConfigProperties();
        swaggerUiConfigProperties.setShowCommonExtensions(true);
        swaggerUiConfigProperties.setPath("/");
        swaggerUiConfigProperties.setDisableSwaggerDefaultUrl(true);
        return swaggerUiConfigProperties;
    }
}