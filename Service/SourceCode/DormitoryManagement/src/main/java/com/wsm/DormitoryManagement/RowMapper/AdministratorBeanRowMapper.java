package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.AdministratorBean;

public final class AdministratorBeanRowMapper implements RowMapper<AdministratorBean> {

	public AdministratorBean mapRow(ResultSet rs, int arg1) throws SQLException {
		AdministratorBean bean = new AdministratorBean();
		bean.setAdminId(rs.getInt("admin_id"));
		bean.setAdminName(rs.getString("admin_name"));
		bean.setAdminNo(rs.getString("admin_no"));
		bean.setAdminPassword(rs.getString("admin_password"));
		bean.setAdminSex(rs.getInt("admin_sex"));
		bean.setAdminTel(rs.getString("admin_tel"));
		return bean;
	}

}
