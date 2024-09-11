/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
/**
 *
 * @author DELL
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Users.findAll",query="Select u from Users u order by u.fullName"),
    @NamedQuery(name="Users.countAll", query="Select COUNT(*) from Users u")
}
)
public class Users {
	private Integer userId;
	private String email;
	private String fullName;
	private String password;

	public Users() {
	}

	public Users(Integer userId, String email, String fullName, String password) {
		this(email, fullName, password);
		this.userId = userId;
	}
	
	public Users(String email, String fullName, String password) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.password = password;
	}

	@Column(name = "user_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Column(name = "full_name")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
