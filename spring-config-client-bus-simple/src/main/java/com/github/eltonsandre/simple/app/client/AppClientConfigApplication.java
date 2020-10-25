package com.github.eltonsandre.simple.app.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackageClasses = AppClientConfigApplication.class)
public class AppClientConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppClientConfigApplication.class, args);
    }

}
