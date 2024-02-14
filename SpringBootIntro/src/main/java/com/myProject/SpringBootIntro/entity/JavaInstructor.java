package com.myProject.SpringBootIntro.entity;


import com.myProject.SpringBootIntro.entity.Instructor;
import org.springframework.stereotype.Component;

// @Component makes this class available for component scanning
@Component
public class JavaInstructor implements Instructor {
    @Override
    public String getProgrammingExercise() {
        return "Write a method that sums up two or three numbers.";
    }
}
