package com.Ebug.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin_Table {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String userName;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String emailId;
	@Column
	private long mobileNo;
	@Column
	private String password;
	@Column
	private String role;
	
	private String adharCard;
	
	private String DOB;
	
	
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	
	public Admin_Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin_Table(long id, String userName, String firstName, String lastName, String emailId, long mobileNo,
			String password, String role, String adharCard, String dOB) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.password = password;
		this.role = role;
		this.adharCard = adharCard;
		DOB = dOB;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
