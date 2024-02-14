package com.myProject.SpringBootIntro.Controller;

import com.myProject.SpringBootIntro.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

    // Define a private variable for the dependency injection


    // whenever we inject a dependency whether that is constructor, setter or field injection
    // we use @Autowired annotation
    @Autowired
    private Instructor instructor;

    // Define a constructor for dependecy injection
    // @Autowired annotation tells spring to inject a dependency
    /*@Autowired
    public InstructorController (Instructor theInstructor){
        instructor = theInstructor;

    what happens in the background:

    Instructor theInstructor = new JavaInstructor();
    InstructorController instructorController = new InstructorController(theInstructor); <- Constructor injection
    }
*/

    /*  // here we are doing setter injection
    @Autowired
    public void setInstructor(Instructor theInstructor){
        instructor = theInstructor;
    }
    */

    // here we are doing field injection
    // no need constructor or setters


    // Expose our new endpoint
    @GetMapping("/programmingExcercise")
    public String getProgrammingExcecise(){

        return instructor.getProgrammingExercise();
    }


}
