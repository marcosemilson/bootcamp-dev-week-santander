package com.digitalinnovation.one.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}
	
	@Bean
	public OpenAPI customAPI(@Value("${application.description}") String description) {
		return new OpenAPI().info(new Info()
				.title("Projeto Criado para o Dev Week Dio-Santander")
				.version("1.0")
				.termsOfService("https://smartbear.com/terms")
				.license(new License().name("Apache 2.0").url("https://springdoc.org")));
	}

}
