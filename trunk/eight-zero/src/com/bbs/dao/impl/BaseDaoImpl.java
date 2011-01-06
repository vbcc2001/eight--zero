package com.bbs.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bbs.dao.BaseDao;
/**
 * 通过操作dao 的实现 
 * @author pucca
 *
 */
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao  
{
	public void delete(Object object) throws Exception 
	{
		this.getHibernateTemplate().delete(object);
	}

}
