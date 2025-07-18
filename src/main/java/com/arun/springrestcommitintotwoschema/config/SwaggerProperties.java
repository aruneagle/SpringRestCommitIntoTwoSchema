package com.arun.springrestcommitintotwoschema.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author arun on 7/18/25
 */
@ConfigurationProperties(prefix = "springdoc.swagger-ui")
public record SwaggerProperties(Api api, Info info) {
    public record Api(@NotNull String groupName, @NotNull String controllerPackage) {
    }

    public record Info(@NotNull String groupName, @NotNull String description, @NotNull String license,
                       @NotNull String licenseUrl, @NotNull String version) {
    }
}
