package com.cricket.Test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {
    @GetMapping(path = "/testInfo")
    public ResponseEntity<String> testInfo(){
        return new ResponseEntity<>("welcome to test cricket",HttpStatus.OK);
    }
}
