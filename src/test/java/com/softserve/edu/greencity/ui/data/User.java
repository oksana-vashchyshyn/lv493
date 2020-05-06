package com.softserve.edu.greencity.ui.data;

public class User {
	private String email;
	private String firstname;
	private String password;

	public User(String email, String firstname, String password) {
		this.email = email;
		this.firstname = firstname;
		this.password = password;
	}

	// setters

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// getters

	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getPassword() {
		return password;
	}

}
