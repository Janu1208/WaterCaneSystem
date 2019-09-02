package com.janu.WaterCaneManagementSystem;

import java.time.LocalDateTime;

public class Admin {
	private User user;
	private String name;
	private Integer canes_avail;
	
	private LocalDateTime createdDate;
	
	

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCanes_avail() {
		return canes_avail;
	}
	
	public void setCanes_avail(Integer canes_avail) {
		this.canes_avail = canes_avail;
	}
	
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", user=" + user + ", canes_avail=" + canes_avail + ", createdDate="
				+ createdDate + "]";
	}

}
