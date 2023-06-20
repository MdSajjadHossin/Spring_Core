package com.shossin.code.springcoredemo.rest;

import com.shossin.code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
     // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public void demoController(@Qualifier("tracCoach") Coach theCoach){
        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}