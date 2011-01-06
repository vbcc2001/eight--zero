package com.bbs.vo;

public class Grade {

	private int gid;				//等级ID
	private String gradeName;		//等级名称
	private int onlineTimelow;		//在线时间下限
	private int ontlineTimehigh;	//在线时间升级上限
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public int getOnlineTimelow() {
		return onlineTimelow;
	}
	public void setOnlineTimelow(int onlineTimelow) {
		this.onlineTimelow = onlineTimelow;
	}
	public int getOntlineTimehigh() {
		return ontlineTimehigh;
	}
	public void setOntlineTimehigh(int ontlineTimehigh) {
		this.ontlineTimehigh = ontlineTimehigh;
	}
}
