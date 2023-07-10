package com.webservice.webserviceSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.webserviceSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	// ResponseEntity -- Tipo que responde a requisições Web
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Marcela", "marcela@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
