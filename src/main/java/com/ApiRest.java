package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

    @GetMapping
    public String hello() {
        return "sala   m";
    }
}
