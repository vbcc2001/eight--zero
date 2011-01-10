package com.bbs.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bbs.dao.BaseDao;
import com.bbs.vo.Page;

/**
 * 通过操作dao 的实现
 * 
 * @author pucca
 * 
 */
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {
	
	public void delete(Object object) throws Exception {
		this.getHibernateTemplate().delete(object);
	}

	public void saveOrUpdate(Object object) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(object);
	}

	public List<Object> findAll(Page page,String className) throws Exception {
		// TODO Auto-generated method stub
		List<Object> list = null;
		Query query = null;
		String hql = "from "+className;
		query = this.getSession().createQuery(hql);
		query.setFirstResult(page.getPagesize() * page.getPagecode() - page.getPagesize()).list();
		query.setMaxResults(page.getPagesize());
		return list;
	}

	public int getSize(String className) throws Exception {
		// TODO Auto-generated method stub
		int row = 0;
		row = this.getHibernateTemplate().find("from " +className).size();
		return row;
	}
	
	public List<Object> findAll(String className) throws Exception {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from "+className);
	}
}
