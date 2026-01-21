package com.course.demo.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("in constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkouts() {
        return "Swim 500 meters as warm up";
    }
}
