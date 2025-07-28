package com.luve2code.springbootdemo;

import org.springframework.stereotype.Component;

@Component("swimmingCoach")
public class SwimmingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Let's have a 10-minute swimming contest";
    }
}
