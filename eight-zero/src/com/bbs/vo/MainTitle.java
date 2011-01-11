package com.bbs.vo;

import java.util.Date;
import java.util.Set;

public class MainTitle {

	private int mid;				//主题表ID
	private String mtitle;			//主题标题
	private String mcontent;		//主题内容
	private Date mtime;				//发表主题时间
	private Userinfo userinfo;		//发表主题用户信息(ID)
	private String mThing;			//表发主题附件
	private SonBorad sonBorad;		//主题类型信息(ID)
	private int mstatus;			//主题状态(0:屏蔽;1可以看)
	private int topstatus; 			//是否置顶状态
	private int checkcount;			//浏览次数
	private Set replay;				//所有回复信息
	public String getmThing() {
		return mThing;
	}
	public void setmThing(String mThing) {
		this.mThing = mThing;
	}
	public Set getReplay() {
		return replay;
	}
	public void setReplay(Set replay) {
		this.replay = replay;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMtitle() {
		return mtitle;
	}
	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public Date getMtime() {
		return mtime;
	}
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	public String getMThing() {
		return mThing;
	}
	public void setMThing(String thing) {
		mThing = thing;
	}
	public SonBorad getSonBorad() {
		return sonBorad;
	}
	public void setSonBorad(SonBorad sonBorad) {
		this.sonBorad = sonBorad;
	}
	public int getMstatus() {
		return mstatus;
	}
	public void setMstatus(int mstatus) {
		this.mstatus = mstatus;
	}
	public int getTopstatus() {
		return topstatus;
	}
	public void setTopstatus(int topstatus) {
		this.topstatus = topstatus;
	}
	public int getCheckcount() {
		return checkcount;
	}
	public void setCheckcount(int checkcount) {
		this.checkcount = checkcount;
	}
}
