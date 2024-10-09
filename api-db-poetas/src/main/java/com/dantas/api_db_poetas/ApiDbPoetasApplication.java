package com.dantas.api_db_poetas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class ApiDbPoetasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDbPoetasApplication.class, args);
	}

}
