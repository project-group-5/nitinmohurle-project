package com.controller;

import com.model.User;

public class AddUserException extends RuntimeException {
private User id;
public AddUserException(User user)

{
	super("id "+user+" not found");
	this.id=user;
			}
@Override
public String toString() {
	return "id "+id+" not available";
}

}
