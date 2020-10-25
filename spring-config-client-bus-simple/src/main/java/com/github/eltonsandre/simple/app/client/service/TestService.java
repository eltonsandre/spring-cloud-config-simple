package com.github.eltonsandre.simple.app.client.service;


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

    private final MainConfigProperties main;
    private final AppConfigProperties app;

    public AnyDTO test() {
        var configs = AnyDTO.builder()
                .appConfigProperties(this.app)
                .mainConfigProperties(this.main)
                .build();

        log.info("configs={}", configs);
        return configs;
    }

}
