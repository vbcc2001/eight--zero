package com.test.borad;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bbs.service.UserTableService;
import com.bbs.service.impl.IUserTableServiceimpl;
import com.bbs.util.HibernateSessionFactory;
import com.bbs.vo.BoradTable;
import com.bbs.vo.SonBorad;

import junit.framework.TestCase;

public class BoradTableTest extends TestCase 
{
	public void testBorad_xml()
	{
		Session session = HibernateSessionFactory.getSession();
		Query query =session.createQuery("from BoradTable");
		List<BoradTable> list = query.list();
		Iterator<BoradTable> iterator = list.iterator();
		while(iterator.hasNext())
		{
			BoradTable borad= iterator.next();
			Iterator<SonBorad> sonIterator = borad.getSonBorad().iterator();
			System.out.print(borad.getBoradName()+":");
			while(sonIterator.hasNext())
			{
				System.out.print(sonIterator.next().getSonName()+",");
			}
			System.out.println("");
		}
	}
	public void testBorad_bean()
	{
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext-*.xml");
		UserTableService uts=(IUserTableServiceimpl)bf.getBean("iuserTableServiceimpl");
	}

}
