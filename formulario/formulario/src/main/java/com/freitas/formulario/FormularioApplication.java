package com.freitas.formulario;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Corretora de imóveis", version = "1", description = "API desenvolvida para gerenciar operações de uma corretora de imóveis"))
@RestController
public class FormularioApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormularioApplication.class, args);
	}

}
