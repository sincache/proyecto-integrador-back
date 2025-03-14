package org.generation.proyecto.integrador.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;




     

@Entity
@Table(name = "credenciales")
public class Credencial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "credencialescol", length = 45, nullable = true)
	private String credencialescol;
	@Column(name = "usuario", length = 45, nullable = false, unique = true)
	private String usuario;
	@Column(name = "password", length = 45, nullable = false)
	private String password;
	@Column(name = "rol", length = 45, nullable = false)
	private  String rol;
	

	

	



	

	public Credencial(long id, String credencialescol, String usuario, String password, String rol) {
		super();
		this.id = id;
		this.credencialescol = credencialescol;
		this.usuario = usuario;
		this.password = password;
		this.rol = rol;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getCredencialescol() {
		return credencialescol;
	}




	public void setCredencialescol(String credencialescol) {
		this.credencialescol = credencialescol;
	}




	public String getUsuario() {
		return usuario;
	}




	public void setUsuario(String usuario) {
		this.usuario = usuario;
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




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Credencial [id=");
		builder.append(id);
		builder.append(", credencialescol=");
		builder.append(credencialescol);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", password=");
		builder.append(password);
		builder.append(", rol=");
		builder.append(rol);
		builder.append("]");
		return builder.toString();
	}
}
	

