package com.myProject.SpringBootIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
/*
@SpringBootApplication(
scanBasePackages = {"com.myProject.SpringBootIntro","com.example.springbootDemo"}
)
 */

public class SpringBootIntroApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootIntroApplication.class, args);
	}

}
