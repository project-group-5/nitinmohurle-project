package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Seat;
@Repository
public interface UserDAO {
	public void bookSeat(Seat s);
	public Seat searchSeat(String string);
	public List<Seat> findAllSeat();
	public boolean updateSeat(Seat s);
	public boolean deleteSeat(String string);
	public void cancelSeat(Seat s);
	public void swapSeat(Seat s);
	public boolean deleteUser(String string);
	
	
	

}