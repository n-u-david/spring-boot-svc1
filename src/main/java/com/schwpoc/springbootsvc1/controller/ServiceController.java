package com.schwpoc.springbootsvc1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/greeting")
    public String home() {
        return "Hello From Service 1";
    }
}
