package com.example.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.UserService;
import com.model.User;

import junit.framework.Assert;

@SpringBootTest
class UserTest {
	
	@Autowired
	UserService service;
	@Test
	void testAdd() {
		User user = new User();
		user.setUserName("Nitin");
		user.setMobileNo("9699275159");
		user.setEmailId("nitin123@gmail.com");
		user.setPassword("12345");
		service.add(user);
		
	User user_tested =service.find(user.getUserName());

		
	}

	@Test
	void testFind() {
	
		setUser(new User());	
			
		
	}

	private void setUser(User user2) {
		
		
	}

	@Test
	void testFindAll() {
	
		User user=new User();
		user.setUserName("Ranjitha");
		user.setMobileNo("9021571270");
		user.setEmailId("RanjithaR@gmail.com");
		
		
		User user1=new User();
		user1.setUserName("shubham");
		
		user1.setMobileNo("7888106257");
		user1.setEmailId("shubham@gmail.com");
		
		User user2=new User();
		user2.setUserName("kusum");
		
		user2.setMobileNo("9767242095");
		user2.setEmailId("kusum98@gmail.com");
		Assert.assertEquals("Ranjitha", user.getUserName());
		
	}

	@Test
	void testUpdate() {
		User user = new User();
		user.setUserName("parag");
		
		user.setMobileNo("7888182888");
		user.setEmailId("parag12@gmail.com");	
		
		}

	@Test
	void testDelete() {
		User user=new User();
		
		//service.delete(1);
		
	}

	

}
