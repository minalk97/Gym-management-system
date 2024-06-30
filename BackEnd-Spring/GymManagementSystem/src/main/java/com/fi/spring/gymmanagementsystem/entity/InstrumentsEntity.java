package com.fi.spring.gymmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instruments")
public class InstrumentsEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="instrumentid")
	int instrumentid;
	
	@Column(name="instrumentname")
	String instrumentname;
	
	@Column(name="cost")
	int cost;
	
	@Column(name="purchasedate")
	String purchasedate;
	
	@Column(name="lastservicingdate")
	String lastservicingdate;
	
	@Column(name="repairedpart")
	String repairedpart;
	
	@Column(name="maintainanceduration")
	String maintainanceduration;

	public int getInstrumentid() {
		return instrumentid;
	}

	public void setInstrumentid(int instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getInstrumentname() {
		return instrumentname;
	}

	public void setInstrumentname(String instrumentname) {
		this.instrumentname = instrumentname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}

	public String getLastservicingdate() {
		return lastservicingdate;
	}

	public void setLastservicingdate(String lastservicingdate) {
		this.lastservicingdate = lastservicingdate;
	}

	public String getRepairedpart() {
		return repairedpart;
	}

	public void setRepairedpart(String repairedpart) {
		this.repairedpart = repairedpart;
	}

	public String getMaintainanceduration() {
		return maintainanceduration;
	}

	public void setMaintainanceduration(String maintainanceduration) {
		this.maintainanceduration = maintainanceduration;
	}


}


