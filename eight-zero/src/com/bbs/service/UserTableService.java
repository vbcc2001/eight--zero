package com.bbs.service;

import com.bbs.vo.UserTable;

public interface UserTableService {
	
	//查询是否存在此用户
	public boolean checkUser(String uname) throws Exception;
	//增加用户
	public void addUser(UserTable user) throws Exception;
	
	//根据ID修改用户信息
	public void updateUser(int uid) throws Exception;
	
	//查询是否存在此邮箱
	public boolean checkEmail(String uemail) throws Exception;
}
