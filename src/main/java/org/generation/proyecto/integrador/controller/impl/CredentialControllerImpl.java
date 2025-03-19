package org.generation.proyecto.integrador.controller.impl;

import org.generation.proyecto.integrador.model.Credential;
import org.generation.proyecto.integrador.service.CredentialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/credentials")
public class CredentialControllerImpl {

	public CredentialService getCredentialService() {
		return credentialService;
	}

	public void setCredentialService(CredentialService credentialService) {
		this.credentialService = credentialService;
	}

	@Autowired
	private CredentialService credentialService;

	// Crear una nueva credencial
	@PostMapping
	public ResponseEntity<Credential> createCredential(@RequestBody Credential credential) {
		ResponseEntity<Credential> ok = ResponseEntity.ok(credentialService.createCredential(credential));
		return ok;
	}

	// Obtener una credencial por ID
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Credential>> getCredential(@PathVariable Long id) {
		return ResponseEntity.ok(credentialService.getCredentialById(id));
	}

	// Actualizar una credencial existente
	@PutMapping("/{id}")
	public ResponseEntity<Credential> updateCredential(@PathVariable Long id, @RequestBody Credential credential) {
		Optional<Credential> existingCredential = credentialService.getCredentialById(id);
		if (existingCredential.isPresent()) {
			Credential updatedCredential = existingCredential.get();
			updatedCredential.setCredentialscol(credential.getCredentialscol());
			updatedCredential.setUser(credential.getUser());
			updatedCredential.setPassword(credential.getPassword());
			updatedCredential.setRole(credential.getRole());
			return ResponseEntity.ok(credentialService.saveCredential(updatedCredential));
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	// Eliminar una credencial por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCredential(@PathVariable Long id) {
		credentialService.deleteCredential(id);
		return ResponseEntity.noContent().build();
	}
}