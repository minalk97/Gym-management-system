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
@Table(name="exerciseplan")
@SecondaryTable(name="exercisechart", pkJoinColumns = @PrimaryKeyJoinColumn(name="exerciseid"))
@SecondaryTable(name="member", pkJoinColumns = @PrimaryKeyJoinColumn(name="email"))
public class ExerciseInsertEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

@Id
@Column(name="exeid")
int exeid;

/*@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="email",referencedColumnName="email",table = "member",insertable=false, updatable=false)
MemberLoginEntity email;*/
String email;
@Column(name="date")
String date;

@Column(name="sets")
int sets;
		
@Column(name="time")
int time;		

/*@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="exerciseid",referencedColumnName="exerciseid",table = "exercisechart",insertable=false, updatable=false)
ExerciseChartEntity exerciseid;*/
int exerciseid;
public ExerciseInsertEntity() {
	super();
}
public int getExeid() {
	return exeid;
}

public void setExeid(int exeid) {
	this.exeid = exeid;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getSets() {
	return sets;
}

public void setSets(int sets) {
	this.sets = sets;
}

public int getTime() {
	return time;
}

public void setTime(int time) {
	this.time = time;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getExerciseid() {
	return exerciseid;
}
public void setExerciseid(int exerciseid) {
	this.exerciseid = exerciseid;
}

}
