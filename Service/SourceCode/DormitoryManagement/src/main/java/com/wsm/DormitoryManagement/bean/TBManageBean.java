package com.wsm.DormitoryManagement.bean;

public class TBManageBean {
	private int TBManageID;
	private int TeacherID;
	private int DormitoryID;
	public int getTBManageID() {
		return TBManageID;
	}
	public void setTBManageID(int tBManageID) {
		TBManageID = tBManageID;
	}
	public int getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(int teacherID) {
		TeacherID = teacherID;
	}
	public int getDormitoryID() {
		return DormitoryID;
	}
	public void setDormitoryID(int dormitoryID) {
		DormitoryID = dormitoryID;
	}
	public String toString(){
		return "ΩÃ ¶∫≈: " + TeacherID + ", Àﬁ…·¬•∫≈: " + DormitoryID;
	}
}
