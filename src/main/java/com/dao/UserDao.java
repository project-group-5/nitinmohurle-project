package com.dao;

import org.springframework.stereotype.Repository;
import java.util.*;
import com.model.*;


@Repository
public interface UserDao {
	

	public User findUser(String i);
	public List<User> findAllUser();
	public boolean deleteUser(String id);
	boolean updateUser(User user);
	public void addUser(User user);
	
	
	
}
