package com.myProject.SpringBootIntro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Rest Controller marks this class as a controller.

@RestController
public class SimpleRestController {

    // expose "/hello" that returns "My Application."
    // "/hello" is called an endpoint
    @GetMapping("/hello")
    public String greeting(){
        return "Run My Application.";

    }

}
