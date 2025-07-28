package com.luv2code.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    public String value() default "LUV";

    // define default error message
    public String message() default "must start with 'LUV' ";

    // define default groups
    public Class<?>[] groups() default{};

    // define default paylodas
    public Class<? extends Payload>[] payload() default{};

}
