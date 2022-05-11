package com.controller;


	

	public class FindAllException extends RuntimeException {


		public FindAllException()
		{
			super("Not Found");
		}

		@Override
		public String toString() {
			return "Not Found";
				
		}
	}
