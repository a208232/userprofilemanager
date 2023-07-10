package com.project.UserProfileManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.project.UserProfileManager.controller.UserController;

@SpringBootApplication
@Import({UserController.class})
public class UserProfileManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProfileManagerApplication.class, args);
	}

}
