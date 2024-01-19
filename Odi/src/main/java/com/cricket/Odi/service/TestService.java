package com.cricket.Odi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="TEST",path = "/test/api")
public interface TestService {
    @GetMapping(path = "/testInfo")
    public ResponseEntity<String> testInfo();
}
