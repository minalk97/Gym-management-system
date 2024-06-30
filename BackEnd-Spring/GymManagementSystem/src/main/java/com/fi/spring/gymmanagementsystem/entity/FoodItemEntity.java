package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foodchart")
public class FoodItemEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="foodid")
	@GeneratedValue(generator="increment")
	int foodid;
	
	@Column(name="foodname")
	String foodname;
	
	@Column(name="nutri_type")
	String nutritype;

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getNutritype() {
		return nutritype;
	}

	public void setNutritype(String nutritype) {
		this.nutritype = nutritype;
	}
	
	
	
}
