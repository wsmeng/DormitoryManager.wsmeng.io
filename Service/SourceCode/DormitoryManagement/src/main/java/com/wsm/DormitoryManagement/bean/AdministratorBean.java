package com.wsm.DormitoryManagement.bean;

public class AdministratorBean {
	private int AdminId;
	private String AdminNo;
	private String AdminPassword;
	private String AdminName;
	private String AdminTel;
	private int AdminSex;
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getAdminNo() {
		return AdminNo;
	}
	public void setAdminNo(String adminNo) {
		AdminNo = adminNo;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminTel() {
		return AdminTel;
	}
	public void setAdminTel(String adminTel) {
		AdminTel = adminTel;
	}
	public int getAdminSex() {
		return AdminSex;
	}
	public void setAdminSex(int adminSex) {
		AdminSex = adminSex;
	}
	@Override
	public String toString(){
		return "ID: " + AdminId + "; 姓名: " + AdminName + "; 密码： " + AdminPassword + "; 性别： " + AdminSex + "; 电话： " + AdminTel;
	}
}
