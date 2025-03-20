package org.generation.proyecto.integrador.service;

import org.generation.proyecto.integrador.model.Credential;

public interface CredentialService {
    Credential getCredential(String userName);
    Credential updateCredential(Credential credential);
    Credential createCredential(Credential credential);
}
