package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.BuildingsBean;

public class BuildingBeanRowMapper implements RowMapper<BuildingsBean> {

	public BuildingsBean mapRow(ResultSet rs, int arg1) throws SQLException {
		BuildingsBean bean = new BuildingsBean();
		bean.setBuildingsId(rs.getInt("buildings_id"));
		bean.setBuildingsName(rs.getString("buildings_name"));
		bean.setBuildingsDesc(rs.getString("buildings_desc"));
		return bean;
	}

}
