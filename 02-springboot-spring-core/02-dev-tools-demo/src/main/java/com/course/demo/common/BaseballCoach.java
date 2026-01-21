package com.course.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkouts() {
        return "Spend 30 minutes in batting practice";
    }
}
