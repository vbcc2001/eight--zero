package com.bbs.vo;

import java.sql.Date;

public class Admin {

	private int aid;
	private String aname;
	private String apwd;
	private Date alasttime;
	private String aip;
	private int alevel;
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
