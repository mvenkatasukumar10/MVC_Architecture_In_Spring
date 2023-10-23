package com.example.RestApI.Model;

public class RestUser {
	private String UserId;
	private String name;
	private String email;
	public String getUserId() {
		return UserId;
	}
	public RestUser() {
	    // Default constructor
	}

	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "RestUser [UserId=" + UserId + ", name=" + name + ", email=" + email + "]";
	}
	
}
