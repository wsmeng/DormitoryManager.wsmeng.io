package com.wsm.DormitoryManagement.bean;

public class TeacherBean {
	private int TeacherID;
	private String TeacherName;
	private String TeacherPassword;
	private String TeacherNo;
	private int TeacherSex;
	private String TeacherTel;
	public int getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(int teacherID) {
		TeacherID = teacherID;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getTeacherPassword() {
		return TeacherPassword;
	}
	public void setTeacherPassword(String teacherPassword) {
		TeacherPassword = teacherPassword;
	}
	public String getTeacherNo() {
		return TeacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		TeacherNo = teacherNo;
	}
	public int getTeacherSex() {
		return TeacherSex;
	}
	public void setTeacherSex(int teacherSex) {
		TeacherSex = teacherSex;
	}
	public String getTeacherTel() {
		return TeacherTel;
	}
	public void setTeacherTel(String teacherTel) {
		TeacherTel = teacherTel;
	}
	public String toString(){
		return "ÐÕÃû: " + TeacherName + ", Ñ§ºÅ£º " + TeacherNo;
	}
}
