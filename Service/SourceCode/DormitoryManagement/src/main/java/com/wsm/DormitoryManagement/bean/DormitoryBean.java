package com.wsm.DormitoryManagement.bean;

public final class DormitoryBean {
	private int DormitoryID;
	private int BuildingsID;
	private String DormitoryName;
	private int DormitoryType;
	private int DormitoryNo;
	private String DormitoryTel;
	public int getDormitoryID() {
		return DormitoryID;
	}
	public void setDormitoryID(int dormitoryID) {
		DormitoryID = dormitoryID;
	}
	public int getBuildingsID() {
		return BuildingsID;
	}
	public void setBuildingsID(int buildingsID) {
		BuildingsID = buildingsID;
	}
	public String getDormitoryName() {
		return DormitoryName;
	}
	public void setDormitoryName(String dormitoryName) {
		DormitoryName = dormitoryName;
	}
	public int getDormitoryType() {
		return DormitoryType;
	}
	public void setDormitoryType(int dormitoryType) {
		DormitoryType = dormitoryType;
	}
	public int getDormitoryNo() {
		return DormitoryNo;
	}
	public void setDormitoryNo(int dormitoryNo) {
		DormitoryNo = dormitoryNo;
	}
	public String getDormitoryTel() {
		return DormitoryTel;
	}
	public void setDormitoryTel(String dormitoryTel) {
		DormitoryTel = dormitoryTel;
	}
	public String toString(){
		return "Â¥ÈººÅ: " + BuildingsID + "; ËÞÉáºÅ: " + DormitoryID;
	}
}
