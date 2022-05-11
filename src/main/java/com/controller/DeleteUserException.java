package com.controller;

public class DeleteUserException  extends RuntimeException{
	
	
	private String id;
	public DeleteUserException(String id) {
		
		super("id "+id+" not found");
		this.id=id;
	}

	@Override
	public String toString() {
		return "id "+ id +" not available";
	}

}