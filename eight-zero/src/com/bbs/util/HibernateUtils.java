package com.bbs.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * hibernate工具类
 * @author eduask.luohui
 */
public class HibernateUtils 
{
	/**
	 * 利用单例设计模式实现
	 */
	private static SessionFactory factory;
	/**
	 * 静态代码块,程序在加载的时候，最先执行此处的代码
	 */
	static 
	{
		try 
		{
			Configuration cfg = new Configuration().configure();
			factory = cfg.buildSessionFactory();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 提供一个获取SessionFactory的共有方法
	 */
	public static SessionFactory getSessionFactory()
	{
		return factory;
	}
	/**
	 * 获取Session对象
	 */
	public static Session getSession() 
	{
		return factory.openSession();
	}
	
	/**
	 * 关闭Session对象
	 */
	public static void closeSession(Session session) 
	{
		if (session != null) {
			if (session.isOpen()) {
				session.close();
			}
		}
	}
}
