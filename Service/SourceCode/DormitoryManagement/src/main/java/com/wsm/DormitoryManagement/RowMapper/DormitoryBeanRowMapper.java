package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.DormitoryBean;

public class DormitoryBeanRowMapper implements RowMapper<DormitoryBean> {

	public DormitoryBean mapRow(ResultSet rs, int arg1) throws SQLException {
		DormitoryBean bean = new DormitoryBean();
		bean.setBuildingsID(rs.getInt("buildings_id"));
		bean.setDormitoryID(rs.getInt("dormitory_id"));
		bean.setDormitoryName(rs.getString("dormitory_name"));
		bean.setDormitoryNo(rs.getInt("dormitory_no"));
		bean.setDormitoryType(rs.getInt("dormitory_type"));
		bean.setDormitoryTel(rs.getString("domitory_tel"));
		return bean;
	}

}
