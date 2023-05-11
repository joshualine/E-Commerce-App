package com.ahia.ecommerceProject.role;

import com.ahia.ecommerceProject.user.User;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 40, nullable = false, unique = true)
	private String name;
	
	@Column(length = 150, nullable = false)
	private String description;

	@ManyToMany(mappedBy = "userRole")
	Set<User> roles;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
