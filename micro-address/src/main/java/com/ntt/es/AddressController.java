package com.ntt.es;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@RestController
@RequestMapping("/address")
@OpenAPIDefinition(info =@Info(title = "Address API", version = "1.0", description = "Documentation Address API v1.0"))
@CrossOrigin
public class AddressController {
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		
		return ResponseEntity.ok("Hello");
	}

}
