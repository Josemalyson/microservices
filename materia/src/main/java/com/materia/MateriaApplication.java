package com.materia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MateriaApplication {
	
	private MateriaApplication() {
		//sonar
	}

	public static void main(String[] args) {
		SpringApplication.run(MateriaApplication.class, args);
	}
}
