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
    private Coach anotherCoach;
    @Autowired
    public void demoController(@Qualifier("cricketCoach") Coach theCoach,
                               @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In Constructor: " + getClass().getSimpleName() );
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/che ck")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
