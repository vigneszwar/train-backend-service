package com.example.demo;

import com.example.demo.model.Waitinglist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		Waitinglist.builder().ticket_id().build();
		SpringApplication.run(DemoApplication.class, args);
	}

}
