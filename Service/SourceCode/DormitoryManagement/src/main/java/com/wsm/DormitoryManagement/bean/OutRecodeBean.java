package com.wsm.DormitoryManagement.bean;

import java.sql.Date;

public class OutRecodeBean {

	private int OutRecodeID;
	private int StudentID;
	private Date OutRecodeDate;
	private String OutRecodeContext;
	public int getOutRecodeID() {
		return OutRecodeID;
	}
	public void setOutRecodeID(int outRecodeID) {
		OutRecodeID = outRecodeID;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public Date getOutRecodeDate() {
		return OutRecodeDate;
	}
	public void setOutRecodeDate(Date outRecodeDate) {
		OutRecodeDate = outRecodeDate;
	}
	public String getOutRecodeContext() {
		return OutRecodeContext;
	}
	public void setOutRecodeContext(String outRecodeContext) {
		OutRecodeContext = outRecodeContext;
	}
	public String toString(){
		return "学生号： " + StudentID + ", 外出原因： " + OutRecodeContext;
	}
	
}
