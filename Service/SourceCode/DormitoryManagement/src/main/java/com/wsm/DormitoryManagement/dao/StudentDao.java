package com.wsm.DormitoryManagement.dao;

import java.util.List;

import com.wsm.DormitoryManagement.bean.StudentBean;

public interface StudentDao extends CommonDao<StudentBean> {
	public abstract String findPassword(String StudentNo);
	public List<StudentBean> findByDormitory(int DormitoryNo);
}
