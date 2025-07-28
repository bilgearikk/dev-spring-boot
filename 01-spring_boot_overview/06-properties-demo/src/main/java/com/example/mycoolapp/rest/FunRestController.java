package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + " Team Name: " + teamName;
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