package org.generation.proyecto.integrador.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
  

@Entity
@Table(name = "credentials")
public class Credential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "credentialscol", length = 45, nullable = false)
	private String credentialscol;
	@Column(name = "user", length = 45, nullable = false, unique = true)
	private String user;
	@Column(name = "password", length = 45, nullable = false, unique = true)
	private String password;
	@Column(name = "role", length = 45, nullable = false)
	private  String role;
	
   Credential(){
	   
   }
	
	public Credential(long id, String credentialscol, String user, String password, String role) {
	super();
	this.id = id;
	this.credentialscol = credentialscol;
	this.user = user;
	this.password = password;
	this.role = role;
}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCredentialscol() {
		return credentialscol;
	}

	public void setCredentialscol(String credentialscol) {
		this.credentialscol = credentialscol;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Credential [id=");
		builder.append(id);
		builder.append(", credentialscol=");
		builder.append(credentialscol);
		builder.append(", user=");
		builder.append(user);
		builder.append(", password=");
		builder.append(password);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}

	
	
}
	

