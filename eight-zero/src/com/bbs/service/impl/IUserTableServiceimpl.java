package com.bbs.service.impl;

import com.bbs.dao.UserTableDao;
import com.bbs.service.UserTableService;
import com.bbs.vo.UserTable;

public class IUserTableServiceimpl implements UserTableService{

	private UserTableDao userTableDao;


	public UserTableDao getUserTableDao() {
		return userTableDao;
	}

	public void setUserTableDao(UserTableDao userTableDao) {
		this.userTableDao = userTableDao;
	}

	//查询是否存在此用户
	public boolean checkUser(String uname) throws Exception {
		
		return userTableDao.checkUser(uname);
	}
	
	//增加用户
	public void addUser(UserTable user) throws Exception {
		
	}

	//根据ID修改用户信息
	public void updateUser(int uid) throws Exception {
		
	}
	
	//查询是否存在此邮箱
	public boolean checkEmail(String uemail) throws Exception {
		return userTableDao.checkEmail(uemail);
	}

}
