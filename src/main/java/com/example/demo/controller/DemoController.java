package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String body) {
        return "You posted: " + body;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
