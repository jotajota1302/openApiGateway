package com.ntt.es;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@RestController
@RequestMapping("/person")
@OpenAPIDefinition(info =@Info(title = "Person API", version = "1.0", description = "Documentation Person API v1.0"))
public class PersonController {
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		
		return ResponseEntity.ok("Hello");
	}

}
