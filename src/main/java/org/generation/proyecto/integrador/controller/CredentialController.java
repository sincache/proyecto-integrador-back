package org.generation.proyecto.integrador.controller;

import org.generation.proyecto.integrador.model.*;
import org.generation.proyecto.integrador.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/credential")
public class CredentialController {

    private final CredentialService credentialService;

    public CredentialController(CredentialService credentialService){
        this.credentialService = credentialService;
    }

    @GetMapping("/obtaincredential/{username}")
    public ResponseEntity<Credential> getCredential(@PathVariable String username){
        Credential credentialObtained= this.credentialService.getCredential(username);
        return credentialObtained != null ? ResponseEntity.ok(credentialObtained) : ResponseEntity.notFound().build();
    }

    @PutMapping("/updatecredential")
    public ResponseEntity<Credential> updateCredential(@RequestBody Credential credential){
        Credential credentialUpdated = this.credentialService.updateCredential(credential);
        return credentialUpdated != null ? ResponseEntity.ok(credentialUpdated) : ResponseEntity.notFound().build();
    }

    @PostMapping("/createcredential") 
    public ResponseEntity<Credential> createCredential(@RequestBody Credential credential){
        Credential credentialCreated = this.credentialService.createCredential(credential);
        return credentialCreated != null ? ResponseEntity.ok(credentialCreated) : ResponseEntity.notFound().build();
    }
    
}


