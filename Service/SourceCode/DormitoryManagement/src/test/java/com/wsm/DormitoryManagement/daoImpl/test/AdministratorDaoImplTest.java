package com.wsm.DormitoryManagement.daoImpl.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsm.DormitoryManagement.bean.AdministratorBean;
import com.wsm.DormitoryManagement.common.Common;
import com.wsm.DormitoryManagement.dao.AdministratorDao;

public class AdministratorDaoImplTest {

	AdministratorBean admin = null;
	AdministratorDao dao = null;
	@SuppressWarnings("resource")
	@Before
	public void setUp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		dao = (AdministratorDao) context.getBean("AdministratorDao");
		admin = new AdministratorBean();
		admin.setAdminName("Œ§ ¶√À");
		admin.setAdminNo("201492373");
		admin.setAdminPassword("weishimeng111000");
		admin.setAdminSex(Common.MALE);
		admin.setAdminTel("18840950708");
	}
	
	@Test
	@Ignore
	public void testInsert() {
		int result = dao.insert(admin);
		assertEquals(1, result);
	}
	@Ignore
	@Test
	public void testDelete() {
		int result = dao.insert(admin);
		assertEquals(1, result);
	}

	@Test
	public void testChange() {
		int result = dao.insert(admin);
		assertEquals(1, result);
	}

	@Test
	public void testFindAll() {
		List<AdministratorBean> lists = dao.findAll();
		for(AdministratorBean list : lists){
			System.out.println(list);
		}
	}

	@Test
	public void testFindBySex() {
		List<AdministratorBean> lists = dao.findBySex(Common.MALE);
		for(AdministratorBean list : lists){
			System.out.println(list);
		}
	}

}
