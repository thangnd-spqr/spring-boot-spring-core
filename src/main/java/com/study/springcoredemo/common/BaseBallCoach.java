package com.study.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyworkout() {
        return "Spend 30 minutes in batting practice";
    }
}
