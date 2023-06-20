package com.shossin.code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TracCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Running a hard 5K!";
    }
}
