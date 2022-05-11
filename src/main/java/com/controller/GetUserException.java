package com.controller;


	

	public class GetUserException extends RuntimeException{
		

		public GetUserException() {
			super("User Id id not available");
		}
		
		@Override
		public String toString() {
			return "User Id is Not available";
		}
	}
