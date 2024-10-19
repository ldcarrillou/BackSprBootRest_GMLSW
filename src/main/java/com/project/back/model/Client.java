package com.project.back.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_table")
public class Client {

	@Id
	private String shared_key;
	private String name;
	private String email;
	private String phone;
	private Date start_date;
	private Date end_date;
	
	public Client() {
		
	}
	
	public Client(String name, String email, String phone, Date start_date, Date end_date) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public String getShared_key() {
		return shared_key;
	}
	public void setShared_key(String shared_key) {
		this.shared_key = shared_key;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
}
