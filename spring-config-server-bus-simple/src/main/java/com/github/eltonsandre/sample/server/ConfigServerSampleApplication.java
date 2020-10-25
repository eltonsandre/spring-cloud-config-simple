package com.github.eltonsandre.sample.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude = {})
public class ConfigServerSampleApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ConfigServerSampleApplication.class, args);
    }

}
