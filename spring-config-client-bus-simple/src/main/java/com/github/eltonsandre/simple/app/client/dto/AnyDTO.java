package com.github.eltonsandre.simple.app.client.dto;

import com.github.eltonsandre.simple.app.client.configuration.properties.AppConfigProperties;
import com.github.eltonsandre.simple.app.client.configuration.properties.MainConfigProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * @author eltonsandre
 */
@Getter
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AnyDTO {

    AppConfigProperties appConfigProperties;
    MainConfigProperties mainConfigProperties;

}

