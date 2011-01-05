package com.bbs.vo;

import java.util.Date;

public class Admin {

	private int aid;		//超级管理员ID
	private String aname;	//超级管理员名字
	private String apwd;	//超级管理员密码
	private Date alasttime;	//超级管理员最后一次登录时间
	private String aip;		//超级管理员上次登录IP
	private int alevel;		//管理员级别 
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApwd() {
		return apwd;
	}
	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	public Date getAlasttime() {
		return alasttime;
	}
	public void setAlasttime(Date alasttime) {
		this.alasttime = alasttime;
	}
	public String getAip() {
		return aip;
	}
	public void setAip(String aip) {
		this.aip = aip;
	}
	public int getAlevel() {
		return alevel;
	}
	public void setAlevel(int alevel) {
		this.alevel = alevel;
	}
}
