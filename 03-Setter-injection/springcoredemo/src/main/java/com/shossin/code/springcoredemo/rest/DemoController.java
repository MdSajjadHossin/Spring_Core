package com.shossin.code.springcoredemo.rest;

import com.shossin.code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
     // define a private field for the dependency
    private Coach myCoach;

    //setter injection
    @Autowired
    public void setCoach(Coach theCoach){ //because of using @Autowired annotation we can use any function name
        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
