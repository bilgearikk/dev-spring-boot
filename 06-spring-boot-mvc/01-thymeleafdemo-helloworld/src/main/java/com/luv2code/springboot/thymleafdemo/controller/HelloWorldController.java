package com.luv2code.springboot.thymleafdemo.controller;


import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML form

    @GetMapping("/showForm")
    public String showForm() {

        return "helloworld-form";
    }

    // need a controller method to process the HTML form

    @GetMapping("/processForm")
    public String processForm() {

        return "helloworld";
    }

    // need a controller method to read form data and add data to the model

    @GetMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // create the messsage
        String result = "Helloo! " + theName;

        // add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }


    @GetMapping ("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        // create the messsage
        String result = ("Hello " + theName + " from V3!") ;

        // add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }
}
