package com.github.eltonsandre.simple.app.client.service;


import com.github.eltonsandre.simple.app.client.configuration.properties.AppConfigImmutableProperties;
import com.github.eltonsandre.simple.app.client.configuration.properties.AppConfigProperties;
import com.github.eltonsandre.simple.app.client.configuration.properties.MainConfigProperties;
import com.github.eltonsandre.simple.app.client.dto.AnyDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final MainConfigProperties configDefault;
    private final AppConfigProperties app;
    private final AppConfigImmutableProperties appImmutable;

    public AnyDTO test() {
        var configs = AnyDTO.builder()
                .configDefault(this.configDefault)
                .configApp(this.app)
                .configAppImmutable(this.appImmutable)
                .build();

        log.info("configs={}", configs);
        return configs;
    }

}
