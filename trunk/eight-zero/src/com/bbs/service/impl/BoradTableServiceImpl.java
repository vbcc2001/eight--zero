package com.bbs.service.impl;

import java.util.List;

import com.bbs.dao.BaseDao;
import com.bbs.exception.NotFindDataException;
import com.bbs.service.BoradTableService;


public class BoradTableServiceImpl implements BoradTableService 
{
	private BaseDao baseDao;
	

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public List<Object> findAll() throws Exception
	{
		try
		{
		return baseDao.findAll("BoradTable");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new NotFindDataException("栏目表查询错误");
		}
	}
}
