package com.fi.spring.gymmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exercisechart")
public class ExerciseChartEntity {

	@Id
	@Column(name="exerciseid")
	int exerciseid;
	
	@Column(name="exercisename")
	String exercisename;
	
	@Column(name="catname")
	String catname;
	
	public int getExerciseid() {
		return exerciseid;
	}

	public void setExerciseid(int exerciseid) {
		this.exerciseid = exerciseid;
	}

	public String getExercisename() {
		return exercisename;
	}

	public void setExercisename(String exercisename) {
		this.exercisename = exercisename;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	

	

	
	
	
}
