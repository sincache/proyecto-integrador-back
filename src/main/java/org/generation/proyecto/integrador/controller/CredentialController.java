/*
package org.generation.proyecto.integrador.controller;

import org.generation.proyecto.integrador.model.Credential;
import org.generation.proyecto.integrador.service.CredentialService;
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
	@RequestMapping("/api/v1/credential")
	public class CredentialController {
		CredentialService credentialService;

		public CredentialController(CredentialService credentialService) {
			this.credentialService = credentialService;
		}

		@GetMapping("{id}")
		Credential getCredentialById(@PathVariable("id") Long id) {
			Credential existingCredential = credentialService.getCredentialById(id)
				.orElseThrow(() -> new RuntimeException("Credential not found with id: " + id));
		    return existingCredential;
		}
		
		@GetMapping
		Page<Credential> getAllUsers(@RequestParam(name = "active", required = false, defaultValue = "true") boolean isActive,
				@RequestParam(name = "size", required = false, defaultValue = "5") int pageSize,
				@RequestParam(name = "page", required = false, defaultValue = "0") int pageNumber) {
			return credentialService.getAllCredential(isActive, pageNumber, pageSize);
		}

		@PostMapping
		ResponseEntity<Credential> createCustomer(@RequestBody Credential newCredential) {
			Credential registeredCredential = credentialService.createCredential(newCredential);
			return ResponseEntity.status(201).body(registeredCredential);
		}

		@PutMapping("{id}")
		ResponseEntity<Credential> updateCredential(@PathVariable("id") Long id, @RequestBody Credential credential) {
		    Credential updatedCredential = CredentialService.updateCredential(credential, id);
		    return ResponseEntity.ok(updatedCredential);
		}
		
		@DeleteMapping("{id}")
		ResponseEntity<Void> deleteCredential(@PathVariable("id") Long id) {
			credentialService.deleteCredential(id);
			return ResponseEntity.noContent().build();
		}
}
*/