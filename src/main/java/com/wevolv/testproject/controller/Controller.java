package com.wevolv.testproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${test.name}")
    String name;

    @GetMapping("/test")
    public String getName(){
        return name;
    }
}
