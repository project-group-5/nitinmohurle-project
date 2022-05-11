package com.model;




import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
	@Entity
	@Table(name="Usertable")
	public class User {
			
		@Id
		@NotNull
		private String userName;
		@NotNull
		@Email
		private String emailId;
		@NotNull
		private String password;
		private int userId;
		private String mobileNo;
		
		
		public User() {
			
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getEmailId() {
			return emailId;
		}


		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public int getUserId() {
			return userId;
		}


		public void setUserId(int userId) {
			this.userId = userId;
		}


		public String getMobileNo() {
			return mobileNo;
		}


		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}


		
		}

		
		
	

		