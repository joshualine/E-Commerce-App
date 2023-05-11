package com.ahia.ecommerceProject.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	//CREATE
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	//READ
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	//UPDATE
	public User updateUser(Integer user_id, User userDetails) {
		User user = userRepository.findById(user_id).get();
		user.setEmail(userDetails.getEmail());
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setPassword(userDetails.getPassword());
		
		return userRepository.save(user);
	}
	
	//DELETE
	public void deleteUser(Integer user_id) {
		userRepository.deleteById(user_id);
	}
}
