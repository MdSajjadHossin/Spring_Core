package com.shossin.code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TracCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Running a hard 5K!";
    }
}
