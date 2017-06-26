package com.wsm.DormitoryManagement.bean;

import java.sql.Date;

public class LogBean {
	private int LogID;
	private int StudentID;
	private int TeacherID;
	private Date LogDate;
	private String LogContext;
	public int getLogID() {
		return LogID;
	}
	public void setLogID(int logID) {
		LogID = logID;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(int teacherID) {
		TeacherID = teacherID;
	}
	public Date getLogDate() {
		return LogDate;
	}
	public void setLogDate(Date logDate) {
		LogDate = logDate;
	}
	public String getLogContext() {
		return LogContext;
	}
	public void setLogContext(String logContext) {
		LogContext = logContext;
	}
	public String toString(){
		return "学生号： " + StudentID + ", 老师号： " + TeacherID + ", 日志内容： " + LogContext;
	}
}
