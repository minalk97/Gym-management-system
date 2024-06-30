package com.fi.spring.gymmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class ManagerLoginEntity {
	@Id
	@Column(name="managerid")
	String managerid;
	@Column(name="password")
	String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getManagerid() {
		return managerid;
	}
	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}
	
	public ManagerLoginEntity(String managerid, String password) {
		super();
		this.managerid = managerid;
		this.password = password;
	}
	public ManagerLoginEntity() {
		
	}
	
	
	
	 
}
