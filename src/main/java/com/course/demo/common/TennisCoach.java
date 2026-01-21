package com.course.demo.common;

import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("constructor in" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkouts() {
        return "Practice your backhand volley";
    }
}
