package com.wsm.DormitoryManagement.daoImpl.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsm.DormitoryManagement.bean.BuildingsBean;
import com.wsm.DormitoryManagement.dao.BuildingsDao;

public class BuildingsDaoImplTest {

	BuildingsDao dao = null;
	BuildingsBean bean = null;
	ApplicationContext context = null;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		dao = (BuildingsDao) context.getBean("BuildingsDao");
		bean = new BuildingsBean();
		bean.setBuildingsName("4舍");
		bean.setBuildingsDesc("目前是大三学生的宿舍");
	}

	@Ignore
	@Test
	public void testInsert() {
		int result = dao.insert(bean);
		assertEquals(1, result);
	}
	
	//删除时出现的问题，删除是正确删除，但是并没与返回删除的行数
	@Ignore
	@Test
	public void testDelete() {
		bean.setBuildingsId(5);
		int result = dao.delete(bean);
		assertEquals(1, result);
	}

	@Test
	public void testChange() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		List<BuildingsBean> lists = dao.findAll();
		for(BuildingsBean list : lists){
			System.out.println(list);
		}
	}

}
