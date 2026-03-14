package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "<!DOCTYPE html><html><head><title>Hello World</title></head><body><h1>Hello World</h1><p>Welcome to the Demo Java Microservice!</p></body></html>";
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Collections.singletonMap("message", "Hello World");
    }

}