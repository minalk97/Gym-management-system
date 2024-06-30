package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="dietplan")
/*
@SecondaryTable(name="mealchart", pkJoinColumns = @PrimaryKeyJoinColumn(name="mealid"))
@SecondaryTable(name="foodchart", pkJoinColumns = @PrimaryKeyJoinColumn(name="foodid"))
@SecondaryTable(name="member", pkJoinColumns = @PrimaryKeyJoinColumn(name="memberid"))
*/
public class DietPlanInsertEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="date")
	String date;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mealid",referencedColumnName="mealid",table = "mealchart",insertable=false, updatable=false)
	MealChartEntity mealid;*/
	int mealid;

	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="foodid",referencedColumnName="foodid",table = "foodchart",insertable=false, updatable=false)
	FoodItemEntity foodid;*/
	int foodid;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="memberid",referencedColumnName="memberid",table = "member",insertable=false, updatable=false)
	MemberLoginEntity memberid;*/
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMealid() {
		return mealid;
	}

	public void setMealid(int mealid) {
		this.mealid = mealid;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
