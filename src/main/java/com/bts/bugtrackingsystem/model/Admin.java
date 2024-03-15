package com.bts.bugtrackingsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int admID;
	@Column(nullable = false)
	private String fName;
	@Column(nullable = false)
	private String lName;
	@Column(unique=true, nullable=false)
	private String email;
	@Column(nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="roleID")
	private Role roleID;
	
	public Admin(int admID, String fName, String lName, String email, String password, Role roleID) {
		super();
		this.admID = admID;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.roleID = roleID;
	}


	public Admin() {
		
	}


	public int getAdmID() {
		return admID;
	}


	public void setAdmID(int admID) {
		this.admID = admID;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
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


	public Role getRoleID() {
		return roleID;
	}


	public void setRoleID(Role roleID) {
		this.roleID = roleID;
	}
	
	
	
	
	

}
