package com.controller;


	

	import com.model.User;

	public class UpdateUserException extends RuntimeException{
		
		private int id;
		
		public UpdateUserException(User user, int id) {
			super("User Id is not available in Database to update");
			this.id = id;
		}

		public UpdateUserException(User user1) {
			
		}

		@Override
		public String toString() {
			return "User Id "+id+" is not available in Database to update";
		}
		
	}