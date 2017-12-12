package com.budget.core.service.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountManagement {

    @RequestMapping("/bar")
    public String home() {
        return "Hello Docker World";
    }
}
