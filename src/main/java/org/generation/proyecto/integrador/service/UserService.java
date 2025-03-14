package org.generation.proyecto.integrador.service;

import org.generation.proyecto.integrador.model.User;
import org.springframework.data.domain.Page;

public interface UserService {
	User createUser(User user);

	User getUserById(Long id);

	User getUserByEmail(String email);

	Page<User> getAllUsers(boolean isActive, int pageNumber, int pageSize);

	User updateUser(User user, Long id);

	void deleteUser(Long id);
}
