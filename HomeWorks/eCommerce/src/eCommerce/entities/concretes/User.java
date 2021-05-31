package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class User implements Entity {
	
		private int id;
		private String firstName;
		private String surName;
		private String emailAdress;
		private String password;
		private boolean isAuth = false;
		private String authToken;
		
		
		public User() {
			super();
		}
	
		public User(int id, String firstName, String surName, String emailAdress, String password,  boolean isAuth) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.surName = surName;
			this.emailAdress = emailAdress;
			this.password = password;
			this.isAuth = isAuth;
		}

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSurName() {
			return surName;
		}

		public void setSurName(String surName) {
			this.surName = surName;
		}

		public String getEmailAdress() {
			return emailAdress;
		}


		public void setEmailAdress(String emailAdress) {
			this.emailAdress = emailAdress;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}

		public String getAuthToken() {
			return authToken;
		}

		public void setAuthToken(String authToken) {
			this.authToken = authToken;
		}

		public boolean isAuth() {
			return isAuth;
		}

		public void setAuth(boolean isAuth) {
			this.isAuth = isAuth;
		}
	

}
