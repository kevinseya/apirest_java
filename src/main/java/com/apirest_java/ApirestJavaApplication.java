package com.apirest_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class ApirestJavaApplication {

	private List<String> nombres = new ArrayList<>(Arrays.asList("Juan", "Pedro", "María", "Ana", "Luis"));

	public static void main(String[] args) {
		SpringApplication.run(ApirestJavaApplication.class, args);
	}

	@GetMapping("/")
	public String saludo() {
		return "¡Hello world!";
	}

	@GetMapping("/nombres")
	public List<String> obtenerNombres() {
		return nombres;
	}

	@PutMapping("/nombres/{index}")
	public String editarNombre(@PathVariable int index, @RequestBody String nuevoNombre) {
		if (index >= 0 && index < nombres.size()) {
			nombres.set(index, nuevoNombre);
			return "Nombre actualizado exitosamente!";
		} else {
			return "Índice fuera de rango";
		}
	}
}
