package com.example.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author derrick
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloTest() {
        return "Hello World";
    }
}
