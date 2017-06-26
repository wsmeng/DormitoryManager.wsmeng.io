package com.wsm.DormitoryManagement.dao;

import java.util.List;

import com.wsm.DormitoryManagement.bean.OutRecodeBean;

public interface OutRecodeDao extends CommonDao<OutRecodeBean> {

	public List<OutRecodeBean> findByStudentID(int StudentID);
	
}
