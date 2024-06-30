package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="member")
public class MemberLoginEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int membershipid;
	@Column(name="memberid")
	@GeneratedValue(generator="increment")
	int memberid;
	@Column(name="membername")
	String name;
	@Id
	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	@Column(name="confirmpassword")
	String cpassword;
	@Column(name="contactno")
	String contactno;
	@Column(name="age")
	int age;
	@Column(name="address")
	String address;
	@Column(name="height")
	String height;
	@Column(name="weight")
	String weight;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getMembershipid() {
		return membershipid;
	}
	public void setMembershipid(int membershipid) {
		this.membershipid = membershipid;
	}
	public MemberLoginEntity() {
		
	}

	
	public MemberLoginEntity(int membershipid, int memberid, String name, String email, String password, String cpassword,
			String contactno, int age, String address, String height, String weight) {
		super();
		this.membershipid = membershipid;
		this.memberid = memberid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpassword = cpassword;
		this.contactno = contactno;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
}
