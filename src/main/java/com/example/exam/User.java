// User.java
package com.example.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="examuser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private String phone;
    private String gender;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(String fullName, String username, String email, String password, String phone, String gender) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.gender = gender;
	}
	public User() {
		
	}
	public User(String fullName2, String email2, String phone2) {
		// TODO Auto-generated constructor stub
		this.fullName = fullName2;
		this.email = email2;
		this.phone = phone2;
	}
}
