package com.example.learnazdevopspcf.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/hello-world")
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello World!!! " + (new Date().toString()), HttpStatus.OK);
    }
}
