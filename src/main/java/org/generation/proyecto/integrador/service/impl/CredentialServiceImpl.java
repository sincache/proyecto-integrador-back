/*
package org.generation.proyecto.integrador.service.impl;

import java.util.Optional;

import org.generation.proyecto.integrador.model.Credential;
import org.generation.proyecto.integrador.repository.CredentialRepository;
import org.generation.proyecto.integrador.service.CredentialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/credential")
@Service
public class CredentialServiceImpl implements CredentialService {

	@Override
	public Credential saveCredential(Credential credential) {
		return credentialRepository.save(credential);
	}
	
	private final CredentialRepository credentialRepository;

    @Autowired
    public CredentialServiceImpl(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    @SuppressWarnings("null")
	
	@Override
	public Credential createCredential(Credential newCredential) {
        Optional<Credential> optionalCredential = credentialRepository.findByCredentialscol(newCredential.getCredentialscol());
        if (optionalCredential.isPresent()) {
            throw new IllegalStateException("User already exist with credential " + newCredential.getCredentialscol());
        }
        newCredential.setId((Long) null);
        Credential newCredential1 = credentialRepository.save(newCredential);
        return newCredential1;
    }

	@Override
	public void deleteCredential(Long id) {
		credentialRepository.deleteById(id);
		
	}

	@Override
	public Optional<Credential> getCredentialById(Long id) {
		 Optional<Credential> optionalCredential = credentialRepository.findById(id);
			if (optionalCredential.isEmpty()) {
				throw new IllegalStateException("Credential does not exist id" + id);
			}
			return optionalCredential;
	}

	@Override
	public Credential getCredentialByCol(String credentialscol) {
	    Optional<Credential> optionalCredential = credentialRepository.findByCredentialscol(credentialscol);
	    if (optionalCredential.isEmpty()) {
	        throw new IllegalStateException("Credential does not exist credential " + credentialscol);
	    }
	    Credential existingCustomer = optionalCredential.get();
	        return existingCustomer;
	    }

}
*/