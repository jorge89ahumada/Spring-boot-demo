package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		run(DemoApplication.class, args);
	}
}
