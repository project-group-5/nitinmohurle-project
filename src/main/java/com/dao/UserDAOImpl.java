package com.dao;
import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.User;

@Component
public class UserDAOImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	


	@Override
	public void addUser(User user) {
		
		Session session= sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	public User findUser(String id) {
		
		
		Session session=sessionFactory.openSession();
	    User user=session.find(User.class, id);
		return user;
	}

	@Override
	public List<User> findAllUser() {
		
		Session session=sessionFactory.openSession();
		List<User> userlist=session.createQuery("select u from User u").list();
		
		return userlist;
	}

	
	@Override
	public boolean updateUser(User user) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	
	public boolean deleteUser(String id) {
		Session session=sessionFactory.openSession();
		User u=session.find(User.class,id);
		session.getTransaction().begin();
		session.delete(u);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}

