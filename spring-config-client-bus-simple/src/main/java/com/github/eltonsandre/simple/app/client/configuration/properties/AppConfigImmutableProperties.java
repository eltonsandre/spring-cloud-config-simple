package com.github.eltonsandre.simple.app.client.configuration.properties;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author eltonsandre
 */
@Value
@RequestScope
@ConstructorBinding
@ConfigurationProperties(prefix = "config-app")
public class AppConfigImmutableProperties {

    String id;
    String name;
    String msg;
    String db;
    String kafka;

    public AppConfigImmutableProperties(String id, String name, String msg, String db, String kafka) {
        this.id = id;
        this.name = name;
        this.msg = msg;
        this.db = db;
        this.kafka = kafka;
    }

}
