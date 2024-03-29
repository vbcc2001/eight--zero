package com.bbs.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bbs.dao.UserTableDao;
import com.bbs.vo.UserTable;

public class IuserTableimpl extends HibernateDaoSupport implements UserTableDao{

	//查询是否存在此用户,TRUE表示用户可用!
	public boolean checkUser(String uname) throws Exception {
		String queryString = "from UserTable u where u.uname=?";
		List list = getHibernateTemplate().find(queryString,uname);
		if(list.size()>0)
		{
			return false;
		}
		return true;
		
	}
	
	//查询是否存在此邮箱,TRUE表示用户可用
	public boolean checkEmail(String uemail) throws Exception {
		String queryString="from UserTable u where u.uemail=?";
		List list=getHibernateTemplate().find(queryString,uemail);
		if(list.size()>0)
		return false;
		return true;
	}
	
	//增加用户
	public void addUser(UserTable user) throws Exception {
		System.out.println("增加用户");
		getHibernateTemplate().save(user);
		
	}

	//根据ID修改用户信息
	public void updateUser(int uid) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
