package com.bbs.dao;

import java.util.List;

import com.bbs.vo.Page;

/**
 * 公用的Dao
 * @author Administrator
 *
 */

public interface BaseDao 
{
	/**
	 * 删除
	 * @param object
	 * @throws Exception
	 */
	public void delete(Object object)throws Exception ;
	/**
	 * 增加or修改
	 * @param object
	 * @throws Exception
	 */
	public void saveOrUpdate(Object object)throws Exception;

	
	/**
	 * 分页
	 * @param page
	 * @return
	 * @throws Exception
	 */
	
	public List<Object> findAll(Page page,String className)throws Exception;
	
	/**
	 * 查询总条数
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public int getSize(String className)throws Exception;
	
	/**
	 * 查询所有
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<Object> findAll(String className)throws Exception;
}
