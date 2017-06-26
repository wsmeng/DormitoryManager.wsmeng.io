package com.wsm.DormitoryManagement.daoImpl.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsm.DormitoryManagement.bean.DormitoryBean;
import com.wsm.DormitoryManagement.daoImpl.DormitoryDaoImpl;

public class DormitoryDaoImplTest {

	private DormitoryDaoImpl dao = null;
	private ApplicationContext context = null;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		dao = (DormitoryDaoImpl) context.getBean("DormitoryDao");
	}

	@Ignore
	@Test
	public void testInsert() {
		for(int i = 0; i < 10; i++){
			DormitoryBean bean = new DormitoryBean();
			bean.setBuildingsID(2);
			bean.setDormitoryName(i + "Éá");
			bean.setDormitoryNo(i);
			bean.setDormitoryTel("884095" + i);
			bean.setDormitoryType(i % 2);
			dao.insert(bean);
		}
	}

	@Ignore
	@Test
	public void testDelete() {
		DormitoryBean bean = new DormitoryBean();
		bean.setDormitoryID(18);
		int result = dao.delete(bean);
		System.out.println(result);
		assertEquals(0, result);
	}

	@Test
	public void testChange() {
		DormitoryBean bean = new DormitoryBean();
		bean.setDormitoryID(17);
		bean.setDormitoryName("´óÈýËÞÉá");
		bean.setDormitoryTel("1774095");
		int result = dao.change(bean);
		assertEquals(1, result);
	}

	@Test
	public void testFindAll() {
		List<DormitoryBean> lists = dao.findAll();
		for(DormitoryBean bean : lists){
			System.out.println(bean);
		}
	}

	@Test
	public void testFindAllInt() {
		List<DormitoryBean> lists = dao.findAll(2);
		for(DormitoryBean bean : lists){
			System.out.println(bean);
		}
	}

}
