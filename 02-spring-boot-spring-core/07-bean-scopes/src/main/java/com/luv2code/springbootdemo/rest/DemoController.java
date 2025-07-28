package com.luv2code.springbootdemo.rest;

import com.luv2code.springbootdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("tennisCoach") Coach thecoach,
            @Qualifier("tennisCoach") Coach theanotherCoach)
    {
        System.out.println("In constructor: "+ getClass().getSimpleName());
        this.myCoach = thecoach;
        this.anotherCoach = theanotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getSwimmingWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
        public String check() {
            return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
        }
    }
