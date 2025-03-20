package org.generation.proyecto.integrador.service.impl;

import java.util.*;
import org.generation.proyecto.integrador.model.*;
import org.generation.proyecto.integrador.repository.*;
import org.generation.proyecto.integrador.service.*;
import org.springframework.stereotype.*;

@Service
public class CredentialServiceImpl implements CredentialService{

    private final CredentialRepository credentialRepository;
    
    public CredentialServiceImpl(CredentialRepository credentialRepository){
        this.credentialRepository = credentialRepository;
    }

    @Override
    public Credential getCredential(String userName){
        return this.credentialRepository.findByUsers(userName)
        .orElseThrow(() -> new IllegalStateException("Credential does not exist with id " + userName));
    }
    
    @Override
    public Credential updateCredential(Credential cred){
        Optional<Credential> existingCredentialOpt = this.credentialRepository.findByUsers(cred.getUsers());
        if(existingCredentialOpt.isEmpty()){
            throw new IllegalStateException("Credential does not exist with id " + cred.getUsers());
        }
        Credential existingCredential = existingCredentialOpt.get();
        existingCredential.setUsers(cred.getUsers());
        existingCredential.setPassword(cred.getPassword());
        existingCredential.setRol(cred.getRol());
        return credentialRepository.save(existingCredential);
    }
    
    @Override
    public Credential createCredential(Credential credential){
        return this.credentialRepository.save(credential);
    }
}
