package com.wsm.DormitoryManagement.dao;

import java.util.List;

public interface CommonDao<T> {
	public int insert(T bean);
	public int delete(T args);
	public int change(T bean);
	public List<T> findAll();
}
