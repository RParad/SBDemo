package com.institute.spring.boot.SBDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDemoApplication.class, args);
	}

	@GetMapping("/getcat")
	public String catResponse() {
		Cat cat = new Cat("T Darg", 7, "Junior Lion");

		return cat.getJsonObjectOfCat();
	}
}

