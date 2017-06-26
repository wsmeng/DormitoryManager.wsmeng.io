package com.wsm.DormitoryManagement.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wsm.DormitoryManagement.bean.TBManageBean;

public class TBManageBeanRowMapper implements RowMapper<TBManageBean> {

	public TBManageBean mapRow(ResultSet rs, int arg1) throws SQLException {
		TBManageBean bean = new TBManageBean();
		bean.setDormitoryID(rs.getInt("dormitory_id"));
		bean.setTBManageID(rs.getInt("tbmanage_id"));
		bean.setTeacherID(rs.getInt("teacher_id"));
		return bean;
	}

}
