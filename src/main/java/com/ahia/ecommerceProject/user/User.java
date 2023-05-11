package com.ahia.ecommerceProject.user;

import java.util.List;
import java.util.Set;

import com.ahia.ecommerceProject.role.Role;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;
	
	@Column(length = 128, nullable = false, unique = true)
	private String email;

	@Column(name = "password", length = 128, nullable = false)
	private String password;
	
	@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 45, nullable = false)
	private String lastName;
	
	@Column(name = "photo", length = 64)
	private String photo;

	@Column(name = "enabled", columnDefinition = "boolean default true")
	private boolean enabled;


	@ManyToMany
	@JoinTable(
			name = "user_role",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
	)
	Set<Role> userRole;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<Role> userRole) {
		this.userRole = userRole;
	}
	
	public void addRole(Role role) {
		this.userRole.add(role);
	}

}
