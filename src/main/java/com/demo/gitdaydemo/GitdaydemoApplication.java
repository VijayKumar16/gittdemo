package com.demo.gitdaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitdaydemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(GitdaydemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String getting() {
		return "vijay kumar kotra s/o Ashok kumar";
	}
	
	@GetMapping("/v")
	public String getting() {
		return "vijay kumar kotra ";
	}

}
