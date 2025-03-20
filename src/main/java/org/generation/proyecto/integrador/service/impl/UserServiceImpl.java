package org.generation.proyecto.integrador.service.impl;

import java.util.Optional;

import org.generation.proyecto.integrador.model.User;
import org.generation.proyecto.integrador.repository.UserRepository;
import org.generation.proyecto.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/user")
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository customerRepository) {
		this.userRepository = customerRepository;
	}

	@Autowired
	@Override
	public User createUser(User user) {
		Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());
		if (optionalUser.isPresent()) {
			throw new IllegalStateException("User already exist with email " + user.getEmail());
		}
		user.setId(null);
		User newUser = userRepository.save(user);
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
		Page<User> users;
		PageRequest pageAndSize = PageRequest.of(pageNumber, pageSize);
		if (isActive) {
			users = userRepository.findAllByActiveTrue(pageAndSize);
		} else {
			users = userRepository.findAllByActiveFalse(pageAndSize);
		}
		return users;
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
