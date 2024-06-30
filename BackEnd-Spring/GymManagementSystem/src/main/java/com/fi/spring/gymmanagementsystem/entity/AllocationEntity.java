package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="memberallocation")
@SecondaryTable(name="trainer", pkJoinColumns = @PrimaryKeyJoinColumn(name="email"))
@SecondaryTable(name="member", pkJoinColumns = @PrimaryKeyJoinColumn(name="email"))
public class AllocationEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(generator="increment")
	int id ;
	@Column(name="mememail")
	String mememail;
	
	@Column(name="traineremail")
	String traineremail;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMememail() {
		return mememail;
	}
	public void setMememail(String mememail) {
		this.mememail = mememail;
	}
	public String getTraineremail() {
		return traineremail;
	}
	public void setTraineremail(String traineremail) {
		this.traineremail = traineremail;
	}
	public AllocationEntity(int id, String mememail, String traineremail) {
		super();
	this.id = id;
		this.mememail = mememail;
		this.traineremail = traineremail;
	}
	public AllocationEntity() {

	}
	
	
}
