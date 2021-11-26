package com.vapasi.cicdapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/message")
    public String message() {
        return "<H1>My Springboot App</H1>";
    }
}
