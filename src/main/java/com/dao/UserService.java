package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {

	
	@Autowired(required = false)
	UserDao  userDAOImpl;
	
	public void add(User user)
	{
		userDAOImpl.addUser(user);
	}
	public User find(String i)
	{
		return userDAOImpl.findUser(i);
	}
	public List<User> findAll()
	{
		return userDAOImpl.findAllUser();
	}
	
	public boolean update(User user)
	{
		return userDAOImpl.updateUser(user);
	}
	
	public boolean delete(String id)
	{
		return userDAOImpl.deleteUser(id);
	}
	
	
	
		
		
	}
