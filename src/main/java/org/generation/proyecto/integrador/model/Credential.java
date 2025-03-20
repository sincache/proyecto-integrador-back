package org.generation.proyecto.integrador.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "credentials")
public class Credential {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long credentialsId;
	
	@JoinColumn(name = "users_id_fk", nullable = false)
	@ManyToOne
	private User usersIdFk;
	
	@Column(name = "credentialscol", nullable = false, length = 45)
	private String credentialscol;
	
	@Column(name = "users", nullable = false)
	private String users;
	
	@Column(name = "password", nullable = false, length = 45)
	private String password;
	
	@Column(name = "rol", nullable = false, length = 45)
	private String rol;
	
	Credential(){
		
	}
	
	Credential(User usersIdFk, String password, String user, String rol){
		this.usersIdFk = usersIdFk;
		this.password = password;
		this.users = user;
		this.rol = rol;
	}

	public Long getCredentialsId() {
		return credentialsId;
	}

	public void setCredentialsId(Long credentialsId) {
		this.credentialsId = credentialsId;
	}

	public User getUsersIdFk() {
		return usersIdFk;
	}

	public void setUsersIdFk(User usersIdFk) {
		this.usersIdFk = usersIdFk;
	}

	public String getCredentialscol() {
		return credentialscol;
	}

	public void setCredentialscol(String credentialscol) {
		this.credentialscol = credentialscol;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
