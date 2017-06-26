package com.wsm.DormitoryManagement.bean;

public class StudentBean {
	private int StudentID;
	private int DormitoryID;
	private String StudentNo;
	private String StudentPassword;
	private String StudentName;
	private int StudentSex;
	private String StudentClass;
	private int StudentState;
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getDormitoryID() {
		return DormitoryID;
	}
	public void setDormitoryID(int dormitoryID) {
		DormitoryID = dormitoryID;
	}
	public String getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(String studentNo) {
		StudentNo = studentNo;
	}
	public String getStudentPassword() {
		return StudentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		StudentPassword = studentPassword;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentSex() {
		return StudentSex;
	}
	public void setStudentSex(int studentSex) {
		StudentSex = studentSex;
	}
	public String getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}
	public int getStudentState() {
		return StudentState;
	}
	public void setStudentState(int studentState) {
		StudentState = studentState;
	}
	public String toString(){
		return "–’√˚: " + StudentName + "; Àﬁ…·∫≈£∫" + DormitoryID;
	}
}
