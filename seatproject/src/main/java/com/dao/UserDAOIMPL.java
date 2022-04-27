package com.dao;

import java.util.List;

import javax.xml.crypto.Data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Seat;


@Component
public class UserDAOIMPL implements Data {
	
	@Autowired
	SessionFactory sessionFactory;

	public void bookSeat(Seat s) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	public Seat searchSeat(int id) {
		Session session=sessionFactory.openSession();
		Seat s1=session.find(Seat.class, id);
		
		return  s1;
		
	}

	public List<Seat> findAllSeat() {
		Session session=sessionFactory.openSession();
		List<Seat> seatlist=session.createQuery("select i from Seat i").list();
		
		return seatlist;
		
	}

	public boolean updateSeat(Seat s) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean deleteSeat(int id) {
		Session session=sessionFactory.openSession();
		Seat s=session.find(Seat.class,id);
		session.getTransaction().begin();
		session.delete(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}


	public void cancelSeat(Seat s) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		
	}

	public void swapSeat(Seat s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		
	}

	
}
