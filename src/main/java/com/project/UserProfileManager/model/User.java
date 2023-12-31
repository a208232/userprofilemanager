package com.project.UserProfileManager.model;

public class User {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;

	public User() {
	}

	public User(Integer id, String firstName, String lastName, String email) {
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("User {} {} has id {}, and email {}", firstName, lastName, userId, email);
	}
}
