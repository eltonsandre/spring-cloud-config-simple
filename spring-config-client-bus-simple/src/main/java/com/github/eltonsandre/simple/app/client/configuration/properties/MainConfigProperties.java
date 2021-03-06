package com.github.eltonsandre.simple.app.client.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author eltonsandre
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "config-global")
public class MainConfigProperties {

    private String profile;
    private String msg;

}
