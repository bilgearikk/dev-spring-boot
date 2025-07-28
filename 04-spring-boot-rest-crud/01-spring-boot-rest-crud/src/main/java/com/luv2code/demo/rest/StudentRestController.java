package com.luv2code.demo.rest;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.luv2code.demo.entity.Student;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudent;

    // define @PostConstructor to load the student data... only once!

    @PostConstruct
    public void loadData() {

        theStudent = new ArrayList<>();

        theStudent.add(new Student("Poornima","Patel"));
        theStudent.add(new Student("Maria","Rossi"));
        theStudent.add(new Student("Joel","Smith"));
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudent() {

        return theStudent;
    }

    // define endpoint or "/students/{studentId}" - return student at index


    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // just index into the list ... keep it simple for now

        // check the studentId again list size
        if ((studentId >= theStudent.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudent.get(studentId);
    }

    // Add an exception handler using @ExceptionHandler


}
























