package com.study.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "Practice your backhand volley";
    }
}
