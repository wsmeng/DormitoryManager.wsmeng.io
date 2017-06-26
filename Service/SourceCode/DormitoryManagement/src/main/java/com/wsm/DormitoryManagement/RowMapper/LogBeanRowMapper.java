package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.LogBean;

public class LogBeanRowMapper implements RowMapper<LogBean> {

	public LogBean mapRow(ResultSet rs, int arg1) throws SQLException {
		LogBean bean = new LogBean();
		bean.setLogContext(rs.getString("log_content"));
		bean.setLogDate(rs.getDate("log_date"));
		bean.setLogID(rs.getInt("log_id"));
		bean.setStudentID(rs.getInt("student_id"));
		bean.setTeacherID(rs.getInt("teacher_id"));
		return bean;
	}

}
