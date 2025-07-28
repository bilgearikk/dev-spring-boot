package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run hard!";
    }

    @GetMapping("/fortune")
    public String luckyDay() {
        return "What a lucky day!";
    }


}