package com.github.eltonsandre.simple.app.client.resources;

import com.github.eltonsandre.simple.app.client.dto.AnyDTO;
import com.github.eltonsandre.simple.app.client.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class TestResource {

    private final TestService service;

    @GetMapping
    public ResponseEntity<AnyDTO> test() {
        return ResponseEntity.ok(this.service.test());
    }
}
