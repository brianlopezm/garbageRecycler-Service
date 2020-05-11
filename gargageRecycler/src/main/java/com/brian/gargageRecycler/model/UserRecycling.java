package com.brian.gargageRecycler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class UserRecycling {
	
	@Column(name = "userName", nullable = false)
    private String userName;
	
	@Column(name = "bottles", nullable = false)
    private int bottles;
	
	@Column(name = "tetrabriks", nullable = false)
    private int tetrabriks;
	
	@Column(name = "glass", nullable = false)
    private int glass;
	
	@Column(name = "paperboard", nullable = false)
    private int paperboard;
	
	@Column(name = "cans", nullable = false)
    private int cans;
	
	@Column(name = "date", nullable = true)
    private Date date;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public UserRecycling() {
		this.date=new Date();
	}
	
	
	public int getBottles() {
		return bottles;
	}


	public void setBottles(int bottles) {
		this.bottles = bottles;
	}


	public int getTetrabriks() {
		return tetrabriks;
	}


	public void setTetrabriks(int tetrabriks) {
		this.tetrabriks = tetrabriks;
	}


	public int getGlass() {
		return glass;
	}


	public void setGlass(int glass) {
		this.glass = glass;
	}


	public int getPaperboard() {
		return paperboard;
	}


	public void setPaperboard(int paperboard) {
		this.paperboard = paperboard;
	}


	public int getCans() {
		return cans;
	}


	public void setCans(int cans) {
		this.cans = cans;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bottles;
		result = prime * result + cans;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + glass;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + paperboard;
		result = prime * result + tetrabriks;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRecycling other = (UserRecycling) obj;
		if (bottles != other.bottles)
			return false;
		if (cans != other.cans)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (glass != other.glass)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (paperboard != other.paperboard)
			return false;
		if (tetrabriks != other.tetrabriks)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	
	
}
