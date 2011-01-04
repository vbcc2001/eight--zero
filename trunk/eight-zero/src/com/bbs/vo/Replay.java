package com.bbs.vo;

import java.util.Date;

public class Replay {

	private int rid; 					// 回复表ID
	private String rcontent;			 // 回复内容
	private MainTitle mainTitle; 			// 回复主贴的信息(如:ID)
	private Date rtime; 					// 回复时间
	private Userinfo userinfo;				 // 回复人用户信息(如:ID)
	private int rstatus;					 // 回复状态(0:屏蔽;1可以看)

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public MainTitle getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(MainTitle mainTitle) {
		this.mainTitle = mainTitle;
	}

	public Date getRtime() {
		return rtime;
	}

	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public int getRstatus() {
		return rstatus;
	}

	public void setRstatus(int rstatus) {
		this.rstatus = rstatus;
	}
}
