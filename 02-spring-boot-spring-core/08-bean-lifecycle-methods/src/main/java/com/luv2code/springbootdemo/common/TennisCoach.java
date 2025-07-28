package com.luv2code.springbootdemo.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    // define an init method
    @PostConstruct
    public void workHard() {
        System.out.println("In hardWork(): "+ getClass().getSimpleName());
    }

    // define a destroy method
    @PreDestroy
    public void cleanup() {
        System.out.println("In cleanup(): "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }
}
