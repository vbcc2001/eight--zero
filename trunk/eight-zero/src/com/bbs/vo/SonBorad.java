package com.bbs.vo;

public class SonBorad {
	private int sid; // 子版块ID
	private String sonName; // 子版块名称
	private BoradTable boradTable; // 大版块信息(如:ID)
	private String sphoto; // 子版块图片
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSonName() {
		return sonName;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}

	public BoradTable getBoradTable() {
		return boradTable;
	}

	public void setBoradTable(BoradTable boradTable) {
		this.boradTable = boradTable;
	}

	public String getSphoto() {
		return sphoto;
	}

	public void setSphoto(String sphoto) {
		this.sphoto = sphoto;
	}
}
