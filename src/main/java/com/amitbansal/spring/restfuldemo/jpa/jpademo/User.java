package com.amitbansal.spring.restfuldemo.jpa.jpademo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//table  - User

@Entity()
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	protected User(){
		
	}
	
	
}
