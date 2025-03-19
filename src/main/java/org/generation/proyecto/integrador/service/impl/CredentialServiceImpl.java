package org.generation.proyecto.integrador.service.impl;

import java.util.Optional;

import org.generation.proyecto.integrador.model.Credential;
import org.generation.proyecto.integrador.repository.CredentialRepository;
import org.generation.proyecto.integrador.service.CredentialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CredentialServiceImpl implements CredentialService {

	@Override
	public Credential saveCredential(Credential credential) {
		return credentialRepository.save(credential);
	}
	
	@Autowired
	private final CredentialRepository  credentialRepository;


    public CredentialServiceImpl(CredentialRepository customerRepository) {
        this.credentialRepository = customerRepository;
    }

    @SuppressWarnings("null")
	
	@Override
	public Credential createCredential(Credential newCredential) {
        Optional<Credential> optionalCredential = credentialRepository.credentialscolfindBy(newCredential.getCredentialscol());
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
	public Page<Credential> getAllCredential(boolean isActive, int pageNumber, int pageSize) {
		Page<Credential> credential = null;
        PageRequest pageAndSize = PageRequest.of(pageNumber, pageSize);
        if (isActive) {
            pageAndSize = (PageRequest) credentialRepository.findAllByActiveTrue(pageAndSize);
        } else {
            pageAndSize = (PageRequest) credentialRepository.findAllByActiveFalse(pageAndSize);
        }
        return credential;
	}

	@Override
	public Credential getCredentialByCol(String credentialscol) {
	    Optional<Credential> optionalCredential = credentialRepository.credentialscolfindBy(credentialscol);
	    if (optionalCredential.isEmpty()) {
	        throw new IllegalStateException("Credential does not exist credential " + credentialscol);
	    }
	    Credential existingCustomer = optionalCredential.get();
	        return existingCustomer;
	    }

}
