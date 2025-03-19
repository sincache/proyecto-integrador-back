package org.generation.proyecto.integrador.service;

import org.generation.proyecto.integrador.model.Credential;
import org.springframework.data.domain.Page;


public interface CredentialService {

	Credential createCredential(Credential newCredential);

	static Credential updateCredential(Credential credential, Long id) {
		return null;
	}

	void deleteCredential(Long id);

	Credential getCredentialById(Long id);
	
	Credential getCredentialByCol(String credentialscol);

	Page<Credential> getAllCredential(boolean isActive, int pageNumber, int pageSize);
	
	
	
	


	

	

}
