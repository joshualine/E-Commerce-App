package com.ahia.ecommerceProject.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserConstroller {

	@Autowired
	UserService userService;
	
	//CREATE USER CONTROLLER METHOD
	@RequestMapping(value="/users", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	//GET OR READ ALL USERS CONTROLLER METHOD
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public List<User> readUsers() {
		return userService.getUsers();
	}
	
	//EDIT USER CONTROLLER METHOD
	@RequestMapping(value="/users/{user_id}", method = RequestMethod.PUT)
	public User editUser(@PathVariable(value = "user_id") Integer id,
			@RequestBody User userDetails) {
		return userService.updateUser(id, userDetails);
	}
	
	//DELETE USER CONTROLLER METHOD
	@RequestMapping(value="/users/{user_id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable(value = "user_id") Integer id) {
		userService.deleteUser(id);
	}
	
}
