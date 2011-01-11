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
	
	/**
	 * 添加数据
	 */
	public void add(Object object) throws Exception {
		this.getHibernateTemplate().save(object);
	}
	/**
	 * 删除数据
	 */
	public void delete(Class clazz, int id) throws Exception {
		this.getHibernateTemplate().delete(this.byIdSelect(clazz,id));
	}
	/**
	 * 查询数据
	 */
	public List<Object> select(String hql) throws Exception {
		Query query = this.getSession().createQuery(hql);
		return query.list();
	}
	/**
	 * 修改数据
	 */
	public void update(Object object) throws Exception {
		this.getHibernateTemplate().update(object);
	}
	/**
	 * 按编号查询数据
	 */
	public Object byIdSelect(Class clazz,int id) throws Exception {
		return this.getHibernateTemplate().get(clazz, id);
	}
	/**
	 * 获得query
	 * 实际上这是将query传替给service层来操作
	 */
	public Query getQuery(String hql) throws Exception {
		return this.getSession().createQuery(hql);
	}
	/**
	 * 模糊查询数据
	 */
	@SuppressWarnings("unchecked")
	public List<Object> selectLike(String hql, int firstResult, int maxSize,
			int[] params) throws Exception {
		List<Object> list = null;
		Query query = this.getQuery(hql);
		if(params!=null)
		{
			for(int i=0;i<params.length;i++)
				query.setParameter(i+1, params[i]);
		}
		list = this.getQuery(hql).setFirstResult(firstResult).setMaxResults(maxSize).list();
		return list;
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
