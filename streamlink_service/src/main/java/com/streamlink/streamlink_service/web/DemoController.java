package com.streamlink.streamlink_service.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${external.property}")
    String property;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(property);
    }
}
