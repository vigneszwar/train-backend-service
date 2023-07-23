package com.example.demo;

import com.example.demo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		User.builder().user_id().name().email().pw().build();
		SpringApplication.run(DemoApplication.class, args);
	}

}
