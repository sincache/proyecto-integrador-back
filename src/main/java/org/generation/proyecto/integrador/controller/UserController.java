package org.generation.proyecto.integrador.controller;

import org.generation.proyecto.integrador.model.User;
import org.generation.proyecto.integrador.service.CredentialService;
import org.generation.proyecto.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@Autowired
	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("{id}")
	User getUserById(@PathVariable("id") Long id) {
		User existingUser = userService.getUserById(id);
		return existingUser;
	}

	@GetMapping
	Page<User> getAllUsers(@RequestParam(name = "active", required = false, defaultValue = "true") boolean isActive,
			@RequestParam(name = "size", required = false, defaultValue = "5") int pageSize,
			@RequestParam(name = "page", required = false, defaultValue = "0") int pageNumber) {
		return userService.getAllUsers(isActive, pageNumber, pageSize);
	}

	@PostMapping("/crear/{password}")
	ResponseEntity<User> createUser(@RequestBody User newUser, @PathVariable("password") String password) {
		User registeredUser = userService.createUser(newUser, password);
		return ResponseEntity.status(201).body(registeredUser);
	}

	@PutMapping("{id}")
	ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		User updatedUser = userService.updateUser(user, id);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("{id}")
	ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
}