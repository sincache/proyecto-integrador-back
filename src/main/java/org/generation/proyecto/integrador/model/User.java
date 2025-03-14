package org.generation.proyecto.integrador.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "first_name", length = 100, nullable = false)
		private String firstName;
		@Column(name = "last_name", length = 100, nullable = true)
		private String lastName;
		@Column(name = "curp", length = 18, nullable = false, unique = true)
		private String curp;
		@Column(name = "email", length = 50, nullable = false, unique = true)
		private String email;
		@Column(name = "phone_number", length = 13, nullable = false, unique = true)
		private Integer phone_number;
		
		User() {	
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCurp() {
			return curp;
		}

		public void setCurp(String curp) {
			this.curp = curp;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(Integer phone_number) {
			this.phone_number = phone_number;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", curp=" + curp
					+ ", email=" + email + ", phone_number=" + phone_number + "]";
		}	
}
