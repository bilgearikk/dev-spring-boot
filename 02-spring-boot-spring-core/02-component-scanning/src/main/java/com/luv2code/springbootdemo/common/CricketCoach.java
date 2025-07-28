package com.luv2code.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
