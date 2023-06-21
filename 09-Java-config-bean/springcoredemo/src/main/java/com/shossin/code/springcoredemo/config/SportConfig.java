package com.shossin.code.springcoredemo.config;

import com.shossin.code.springcoredemo.common.Coach;
import com.shossin.code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
