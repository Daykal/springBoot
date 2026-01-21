package com.course.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello asdsld";
    }

    @GetMapping("/user")
    public Map<String, Object> getUser() {
        return Map.of("name", "Alice", "age", 25);
    }

}
