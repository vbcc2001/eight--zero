package com.bbs.struts2;

import com.bbs.service.UserTableService;
import com.bbs.service.impl.IUserTableServiceimpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserTableAction extends ActionSupport{

	private String uname;			//用户名(账号)
	private String upwd;			//用户密码
	private String uemail;			//用户邮箱
	private int sex;				//用户性别(1:男生;0:女生)
	private IUserTableServiceimpl iuserTableServiceimpl;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public String checkUser(){
		
		
		return "error";
	}
}
