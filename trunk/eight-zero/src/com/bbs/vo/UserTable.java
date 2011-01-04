package com.bbs.vo;

import java.util.Date;

public class UserTable {

	private int uid;				//用户表ID
	private String uname;			//用户名(账号)
	private String upwd;			//用户密码
	private String uemail;			//用户邮箱
	private int sex;				//用户性别(1:男生;0:女生)
	private Date regTime;			//注册时间
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	private int ustatus;			//用户状态(1:可用;0:锁定)
	private Userinfo userinfo;		//用户信息表信息(如:uscore)
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	public int getUstatus() {
		return ustatus;
	}
	public void setUstatus(int ustatus) {
		this.ustatus = ustatus;
	}
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
}
