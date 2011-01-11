package com.bbs.dao;

import java.util.List;

import org.hibernate.Query;

import com.bbs.vo.Page;

/**
 * 公用的Dao
 * @author Administrator
 *
 */

public interface BaseDao 
{
	/**
	 * 查询查询数据
	 * @param hql
	 * @throws Exception
	 */
	public List<Object> select(String hql) throws Exception;
	/**
	 * 分页模糊查询
	 * @param hql
	 * @param firstResult
	 * @param maxSize
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<Object> selectLike(String hql,int firstResult,int maxSize,int[] params) throws Exception;
	/**
	 * 添加数据
	 * @param object
	 * @throws Exception
	 */
	public void add(Object object) throws Exception;
	/**
	 * 修改数据
	 * @param object
	 * @throws Exception
	 */
	public void update(Object object)throws Exception;
	/**
	 * 单个删除
	 */
	public void delete(Class clazz,int id) throws Exception;
	/**
	 * 按对象查询数据
	 */
	public Object byIdSelect(Class clazz,int ids) throws Exception;
	/**
	 * 这个query用于serviceimpl层
	 * @param hql
	 * @return
	 * @throws Exception
	 */
	public Query getQuery(String hql) throws Exception;

	
	/**
	 * 分页
	 * @param page
	 * @return
	 * @throws Exception
	 */
	
	public List<Object> findAll(Page page,String className)throws Exception;
	
	public int getSize(String className)throws Exception;
	
	/**
	 * 查询所有数据
	 * @param page
	 * @return
	 * @throws Exception
	 */
	
	public List<Object> findAll(String className)throws Exception;
}
