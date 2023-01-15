package com.ContabilidadeAPI.apiContabilidadeINSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="/")
public class ApiContabilidadeInssApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiContabilidadeInssApplication.class, args);
	}


}
