package com.arun.springrestcommitintotwoschema;

import com.arun.springrestcommitintotwoschema.config.SwaggerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {
        SwaggerProperties.class
})
public class SpringRestCommitIntoTwoSchemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestCommitIntoTwoSchemaApplication.class, args);
    }

}
