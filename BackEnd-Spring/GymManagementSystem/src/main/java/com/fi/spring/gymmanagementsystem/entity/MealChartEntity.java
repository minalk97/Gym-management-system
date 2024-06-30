package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mealchart")
public class MealChartEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
		@Id
		@Column(name="mealid")
		@GeneratedValue(generator="increment")
		int mealid;
		
		@Column(name="mealtype")
		String mealtype;
		
		public int getMealid() 
		{
			return mealid;
		}

		public void setMealid(int mealid) 
		{
			this.mealid = mealid;
		}

		public String getMealtype() {
			return mealtype;
		}

		public void setMealtype(String mealtype) {
			this.mealtype = mealtype;
		}

}
