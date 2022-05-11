package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserService;
import com.model.User;

@RestController

public class UserRestController {

	@Autowired
	UserService service;
	private String string;
	
	@GetMapping("/getuser")
	public List<User> getAllUser()
	{
		return service.findAll();
	}
	
	@GetMapping("getuser/{id}")
	public ResponseEntity<?> getUser(@PathVariable String id){
		User user = service.find(id);
		
		if(user == null) {
			throw new GetUserException();
		}
		service.find(id);
		return ResponseEntity.ok("User Displayed Successfully");
	}
	
	@PostMapping("/adduser")  
	public ResponseEntity<?> addUser(@RequestBody User user) throws AddUserException
	{
		if(user.getMobileNo().length() > 11 || user.getMobileNo().length() < 10) 
		{
			throw new AddUserException(user);
		}
		
		service.add(user);
		return ResponseEntity.ok("User added successfully");
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable String id) throws DeleteUserException{
		User user = service.find(id);
		
		if(user == null) {
			throw new DeleteUserException(id);
		}
		
		service.delete(id);
		return ResponseEntity.ok("User Deleted Successfully");
	}

	
	@PatchMapping("/updateuser")
	public ResponseEntity<?> updateUser(@RequestBody User user) throws UpdateUserException{
	//
		
		service.update(user);
		return ResponseEntity.ok("User Updated Successfully");
	}
}
