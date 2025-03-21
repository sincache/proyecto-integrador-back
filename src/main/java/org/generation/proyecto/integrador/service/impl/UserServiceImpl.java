package org.generation.proyecto.integrador.service.impl;

import java.util.Optional;

import org.generation.proyecto.integrador.model.User;
import org.generation.proyecto.integrador.model.Credential;
import org.generation.proyecto.integrador.repository.UserRepository;
import org.generation.proyecto.integrador.service.CredentialService;
import org.generation.proyecto.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserServiceImpl implements UserService {
	
	@Autowired
	CredentialService credentialService;

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository customerRepository) {
		this.userRepository = customerRepository;
	}

	@Override
	public User createUser(User user, String password) {
		Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());
		if (optionalUser.isPresent()) {
			throw new IllegalStateException("User already exist with email " + user.getEmail());
		}
		
		user.setId(null);
		User newUser = userRepository.save(user);
		Credential credential = new Credential();
		credential.setUsers(user.getEmail());
		credential.setUsersIdFk(newUser);
		credential.setPassword(password);
		credential.setCredentialscol("");
		credential.setRol("admin");
		credentialService.createCredential(credential);
		return newUser;
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isEmpty()) {
			throw new IllegalStateException("User does not exist with id " + id);
		}
		User existingCustomer = optionalUser.get();
		return existingCustomer;
	}

	@Override
	public User getUserByEmail(String email) {
		Optional<User> optionalUser = userRepository.findByEmail(email);
		if (optionalUser.isEmpty()) {
			throw new IllegalStateException("User does not exist with email " + email);
		}
		return optionalUser.get();
	}

	@Override
	public Page<User> getAllUsers(boolean isActive, int pageNumber, int pageSize) {
	    PageRequest pageAndSize = PageRequest.of(pageNumber, pageSize);
	    return userRepository.findAll(pageAndSize);
	}

	@Override
	public User updateUser(User user, Long id) {
		User existingUser = getUserById(id);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setCurp(user.getCurp());
		existingUser.setEmail(user.getEmail());
		existingUser.setPhone_number(user.getPhone_number());
		return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
