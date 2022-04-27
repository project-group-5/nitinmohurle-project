package com.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Seat;
@Service
public class UserService {
	@Autowired
	UserDAO UserDAOImpl;

	public void add(Seat s) {
		UserDAOImpl.bookSeat(s);
		
	}
	public Seat find(String i) {
		return UserDAOImpl.searchSeat(i);
	}
	public List<Seat> findAll(){
		return UserDAOImpl.findAllSeat();
	}
	public boolean update(Seat s) {
		return UserDAOImpl.updateSeat(s);
	}
	public boolean delete(String string) {
		return UserDAOImpl.deleteUser(string);

}
	public void cancel(Seat s) {
		UserDAOImpl.cancelSeat(s);
	}
	public void swap(Seat s) {
		UserDAOImpl.swapSeat(s);
	}
	public Seat find(int i) {
		return null;
	}
}