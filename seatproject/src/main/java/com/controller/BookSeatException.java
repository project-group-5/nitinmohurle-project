package com.controller;

import java.util.Set;

import com.model.Seat;

public class BookSeatException extends RuntimeException {
	private static int id;
	private Object duration;
	public BookSeatException(Seat s) {
		
		Set s1=(Set) new Seat();
		this.duration=duration;
	
		
	}

	@Override
	public String toString() {
		return  "Booking cannot be done";
	}

}