package com.wsm.DormitoryManagement.dao;

import java.util.List;

import com.wsm.DormitoryManagement.bean.AdministratorBean;

public interface AdministratorDao extends CommonDao<AdministratorBean> {
	public List<AdministratorBean> findBySex(int sex);
}
