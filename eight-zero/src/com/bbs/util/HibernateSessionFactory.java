package com.bbs.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * 单态模式(singleton)的hibernate工具类,可以获得sessionFactory和session对象,关闭session
 * @author xxxman
 * @version 1.0 , 2010/11/30
 *
 * @since 
 */
public class HibernateSessionFactory 
{
	
	private static SessionFactory sessionFactory;
	
	/**
	 * 私有构造方法
	 */
	private HibernateSessionFactory()
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	/**
	 * 静态获得sessionFactory对象 
	 * @return 返回静态SessionFactory
	 */
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			new HibernateSessionFactory();
		}
		return sessionFactory;
	}
	
	/**
	 * 静态获得openSession()产生的session对象(非静态的)
	 * @return session对象
	 */
	public static Session getSession()
	
	{
		if(sessionFactory == null)
		{
			new HibernateSessionFactory();
		}
		
		return sessionFactory.openSession() ;
	}
	
	/**
	 * session关闭方法,判断了session不为空 和 打开状态则
	 * @param session 要关闭的session对象
	 */
	public static void close(Session session)
	{
		if(session!=null&&session.isOpen())
		{
			session.close();
		}
	}
	
	
	
	
}
