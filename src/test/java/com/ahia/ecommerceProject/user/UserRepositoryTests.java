package com.ahia.ecommerceProject.user;

//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.ahia.ecommerceProject.role.Role;

//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback
//public class UserRepositoryTests {
//	
//	@Autowired
//	private UserRepository repo;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testCreateUser() {
//		Role roleAdmin = entityManager.find(Role.class, 1);
//		User userJosh = new User("josh@gmail.com", "password", "Josh", "Chinwendu");
//		userJosh.addRole(roleAdmin);
//		
//		User savedUser = repo.save(userJosh);
//		
//		assertThat(savedUser.getId()).isGreaterThan(0);
//	}
//
//}
