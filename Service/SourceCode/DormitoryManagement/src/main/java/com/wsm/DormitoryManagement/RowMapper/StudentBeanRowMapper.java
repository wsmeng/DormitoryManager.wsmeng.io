package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.StudentBean;

public class StudentBeanRowMapper implements RowMapper<StudentBean> {

	public StudentBean mapRow(ResultSet rs, int arg1) throws SQLException {
		StudentBean bean = new StudentBean();
		bean.setDormitoryID(rs.getInt("dormitory_id"));
		bean.setStudentClass(rs.getString("student_class"));
		bean.setStudentID(rs.getInt("student_id"));
		bean.setStudentName(rs.getString("student_name"));
		bean.setStudentNo(rs.getString("student_no"));
		bean.setStudentPassword(rs.getString("student_password"));
		bean.setStudentSex(rs.getInt("student_sex"));
		bean.setStudentState(rs.getInt("student_state"));
		return bean;
	}

}
