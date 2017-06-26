package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.OutRecodeBean;

public class OutRecodeBeanRowMapper implements RowMapper<OutRecodeBean> {

	public OutRecodeBean mapRow(ResultSet rs, int arg1) throws SQLException {
		OutRecodeBean bean = new OutRecodeBean();
		bean.setOutRecodeContext(rs.getString("outrecode_reson"));
		bean.setOutRecodeDate(rs.getDate("outrecode_date"));
		bean.setOutRecodeID(rs.getInt("outrecode_id"));
		bean.setStudentID(rs.getInt("student_id"));
		return bean;
	}

}
