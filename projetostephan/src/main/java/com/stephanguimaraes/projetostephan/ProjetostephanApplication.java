package com.stephanguimaraes.projetostephan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com/stephanguimaraes/projetostephan/entities")

@SpringBootApplication
public class ProjetostephanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetostephanApplication.class, args);

	}

}
