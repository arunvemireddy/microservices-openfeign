package com.cricket.Odi.controller;

import com.cricket.Odi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class OdiController {

    @Autowired
    private TestService testService;

    @GetMapping(path = "/odiInfo")
    public ResponseEntity<?> odiInfo(){
        return new ResponseEntity<>("Welcome to ODI Cricket", HttpStatus.OK);
    }
    @GetMapping(path = "/testInfo")
    public ResponseEntity<String> testInfo(){
        return new ResponseEntity<>(testService.testInfo().getBody(), HttpStatus.OK);
    }
}
