package com.course.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return teamName + " Hello " + coachName;
    }

    @GetMapping("/user")
    public Map<String, Object> getUser() {
        return Map.of("name", "Alice", "age", 25);
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 10K";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }


}

