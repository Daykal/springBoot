package com.course.demo.common;

import org.springframework.stereotype.Component;


@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkouts() {
        return "Run a hard 50K!";
    }
}
