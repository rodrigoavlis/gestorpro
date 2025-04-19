package com.gestorpro.gestorpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/")
public class GestorproApplication {

	@GetMapping
	public String getHomeTeste(){
		return "Funcionario = API home";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestorproApplication.class, args);
	}

}

