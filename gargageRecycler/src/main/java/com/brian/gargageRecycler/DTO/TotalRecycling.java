package com.brian.gargageRecycler.DTO;

import java.io.Serializable;
import java.util.List;

import com.brian.gargageRecycler.model.UserRecycling;

public class TotalRecycling implements Serializable {
	private int bottles=0;
	private int tetrabriks=0;
	private int glass=0;
	private int paperboard=0;
	private int cans=0;
	private String UserName;
	private float tons=0;
		
	public TotalRecycling(String userName,List<UserRecycling> list) {
		setUserName(userName);
		addRecycling(list);
	}
	
	private void addRecycling(List<UserRecycling> listByUser) {
		for (UserRecycling ur:listByUser) {
			setBottles(ur.getBottles());
			setCans(ur.getCans());
			setGlass(ur.getGlass());
			setPaperboard(ur.getPaperboard());
			setTetrabriks(ur.getTetrabriks());
		}
	}

	public int getBottles() {
		return bottles;
	}

	public void setBottles(int bottles) {
		this.bottles = this.bottles+bottles;
		setTons((float) (bottles*0.44));
	}

	public int getTetrabriks() {
		return tetrabriks;
	}

	public void setTetrabriks(int tetrabriks) {
		this.tetrabriks = this.tetrabriks+tetrabriks;
		setTons((float) (tetrabriks*0.29));
	}

	public int getGlass() {
		return glass;
	}

	public void setGlass(int glass) {
		this.glass = this.glass+glass;
		setTons((float) (glass*0.4));
	}

	public int getPaperboard() {
		return paperboard;
	}

	public void setPaperboard(int paperboard) {
		this.paperboard = this.paperboard+paperboard;
		setTons((float) (paperboard*0.23));
	}

	public int getCans() {
		return cans;
	}

	public void setCans(int cans) {
		this.cans = this.cans+cans;
		setTons((float) (cans*0.3));
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public float getTons() {
		return tons;
	}

	public void setTons(float tons) {
		this.tons = this.tons+tons;
	}
	
}
