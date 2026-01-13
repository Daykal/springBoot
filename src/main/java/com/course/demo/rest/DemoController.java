package com.course.demo.rest;

import com.course.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;
//
//    @Autowired
//    public void setMyCoach(Coach theCoach){
//        this.myCoach = theCoach;
//    }

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkouts();
    }

}
