package com.wsm.DormitoryManagement.daoImpl.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsm.DormitoryManagement.bean.StudentBean;
import com.wsm.DormitoryManagement.dao.StudentDao;

public class StudentDaoImplTest {

	private ApplicationContext context = null;
	private StudentDao dao = null;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		dao = (StudentDao) context.getBean("StudentDao");
	}

	
	//该测试过程中证明StudentDaoImpl类的实现有问题
	//暂时还没有解决
	//问题的现象是：当进行插入操作时，会生成两组一样的数据
	@Ignore
	@Test
	public void testInsert() {
		int count = 2;
		StudentBean bean = new StudentBean();
		bean.setDormitoryID(count);
		bean.setStudentClass("软141" + (count));
		bean.setStudentName("herry" + count + "me");
		bean.setStudentNo("20149237" + count);
		bean.setStudentPassword("wsmeng" + count + "acd");
		bean.setStudentSex((count % 2 == 0 ? 1 : 0));
		bean.setStudentState(1);
		dao.insert(bean);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testChange() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testFindAll() {
		List<StudentBean> lists = dao.findAll();
		for(StudentBean bean : lists){
			System.out.println(bean);
		}
	}

	@Test
	public void testFindPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByDormitory() {
		fail("Not yet implemented");
	}

}
