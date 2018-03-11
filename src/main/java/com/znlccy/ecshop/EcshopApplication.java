package com.znlccy.ecshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
@CrossOrigin(maxAge = 3600, origins = "*")
public class EcshopApplication {

	@RequestMapping(value = "/index")
	public String index() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(EcshopApplication.class, args);
	}
}
