package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trainer")
public class TrainerLoginEntity implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Column(name="trainerid")
	int trainerid;
	@Column(name="trainername")
	String trainername;
	@Id
	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	@Column(name="speciality")
	String speciality;
	@Column(name="availability")
	String availability;
	@Column(name="doj")
	String doj;
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public TrainerLoginEntity(int trainerid, String trainername, String email, String password, String speciality,
			String availability, String doj) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.email = email;
		this.password = password;
		this.speciality = speciality;
		this.availability = availability;
		this.doj = doj;
	}
	public TrainerLoginEntity() 
	{
		
	}
	
	
}
