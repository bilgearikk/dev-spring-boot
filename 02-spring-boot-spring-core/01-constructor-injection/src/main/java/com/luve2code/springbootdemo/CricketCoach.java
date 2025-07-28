package com.luve2code.springbootdemo;

import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
