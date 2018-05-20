package test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.huahai.oracle.bean.UserClass;
import cn.huahai.oracle.dao.UserMapper;


public class UserTest {
	ApplicationContext ac;
	UserMapper um;
	@Before
	public void before() {
		this.ac= new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml");
		this.um= ac.getBean("userMapper",UserMapper.class);
	}
	@Test
	public void selectAll() {
		UserClass[] userClass = um.selectAll();
		System.out.println(userClass[0]);
		System.out.println(userClass[1]);
//		um.insertUser(7,"lizhuodong");
	}
}
