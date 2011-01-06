package com.bbs.service.impl;

import com.bbs.service.UserTableService;
import com.bbs.vo.UserTable;

public class IUserTableServiceimpl implements UserTableService{

	private UserTableService userTableService;

	//查询是否存在此用户
	public boolean checkUser(String uname) throws Exception {
		
		return userTableService.checkUser(uname);
	}
	
	//增加用户
	public void addUser(UserTable user) throws Exception {
		
	}

	//根据ID修改用户信息
	public void updateUser(int uid) throws Exception {
		
	}

}
