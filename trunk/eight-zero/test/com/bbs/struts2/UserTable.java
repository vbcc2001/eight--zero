package com.bbs.struts2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bbs.service.UserTableService;
import com.bbs.service.impl.IUserTableServiceimpl;

import junit.framework.TestCase;


public class UserTable extends TestCase
{
	public void testUser()
	{
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext-*.xml");
		UserTableService uts=(IUserTableServiceimpl)bf.getBean("iuserTableServiceimpl");
		try {
			System.out.println(uts.checkUser("xiaochang"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ddf");
	}
}
