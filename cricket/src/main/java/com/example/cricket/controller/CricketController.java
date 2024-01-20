package com.example.cricket.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CricketController {

    @GetMapping(path = "/cricInfo")
    private ResponseEntity<?> cricInfo() {
        return new ResponseEntity<>("Welcome to Cricket App", HttpStatus.OK);
    }


}
