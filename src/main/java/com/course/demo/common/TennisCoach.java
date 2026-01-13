package com.course.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkouts() {
        return "Practice your backhand volley";
    }
}
