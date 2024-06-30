package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="membershipplan")
public class MembershipPlanEntity implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	// @JsonDeserialize(using = CustomMembershipIdDeserializer.class) 
	@Id
	@Column(name="membershipid")
	//@GeneratedValue(generator="increment")
	int membershipid;
	@Column(name="title")
	String title;
	@Column(name="price")
	String price;
	
	
	public String getTitle() {
		return title;
	}
	
	public int getMembershipid() {
		return membershipid;
	}

	public void setMembershipid(int membershipid) {
		this.membershipid = membershipid;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public MembershipPlanEntity(int membershipid, String title, String price) {
		super();
		this.membershipid = membershipid;
		this.title = title;
		this.price = price;
	}
	public MembershipPlanEntity() {
	}
	
	
	
}
