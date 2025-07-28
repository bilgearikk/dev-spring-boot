package com.luv2code.springbootdemo.common;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Let's have a 10-minute swimming contest!!";
    }
}
