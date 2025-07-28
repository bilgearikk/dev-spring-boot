package com.luv2code.springbootdemo.rest;

import com.luv2code.springbootdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach swimmingCoach;

    @Autowired
    public void setCoach(Coach coach){ // use any method name
        swimmingCoach = coach;
    }


    @GetMapping("/swimmingworkout")
    public String getSwimmingWorkout() {
        return swimmingCoach.getDailyWorkout();
    }
}
