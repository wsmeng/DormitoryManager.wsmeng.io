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
		bean.setBuildingsName("4��");
		bean.setBuildingsDesc("Ŀǰ�Ǵ���ѧ��������");
	}

	@Ignore
	@Test
	public void testInsert() {
		int result = dao.insert(bean);
		assertEquals(1, result);
	}
	
	//ɾ��ʱ���ֵ����⣬ɾ������ȷɾ�������ǲ�û�뷵��ɾ��������
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
