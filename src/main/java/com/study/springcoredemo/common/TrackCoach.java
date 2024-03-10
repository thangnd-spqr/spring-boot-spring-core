package com.study.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyworkout() {
        return "Run 5k";
    }
}
