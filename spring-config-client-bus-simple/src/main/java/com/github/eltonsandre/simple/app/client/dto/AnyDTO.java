package com.github.eltonsandre.simple.app.client.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import com.github.eltonsandre.simple.app.client.configuration.properties.AppConfigImmutableProperties;
import com.github.eltonsandre.simple.app.client.configuration.properties.AppConfigProperties;
import com.github.eltonsandre.simple.app.client.configuration.properties.MainConfigProperties;

/**
 * @author eltonsandre
 */
@Getter
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AnyDTO {

    AppConfigProperties configApp;
    AppConfigImmutableProperties configAppImmutable;
    MainConfigProperties configDefault;

}

