package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.TeacherBean;

public class TeacherBeanRowMapper implements RowMapper<TeacherBean> {

	public TeacherBean mapRow(ResultSet rs, int arg1) throws SQLException {
		TeacherBean bean = new TeacherBean();
		bean.setTeacherID(rs.getInt("teacher_id"));
		bean.setTeacherName(rs.getString("teacher_name"));
		bean.setTeacherNo(rs.getString("teacher_no"));
		bean.setTeacherPassword(rs.getString("teacher_password"));
		bean.setTeacherSex(rs.getInt("teacher_sex"));
		bean.setTeacherTel(rs.getString("teacher_tel"));
		return bean;
	}

}
