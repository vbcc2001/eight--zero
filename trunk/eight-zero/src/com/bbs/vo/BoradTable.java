package com.bbs.vo;

import java.util.Set;

public class BoradTable {

	private int bid;				//版块表ID
	private String boradName;		//版块名称
	private String bphoto;			//版块图片
	private Set sonBorad;			//子版块信息

	public Set getSonBorad() {
		return sonBorad;
	}
	public void setSonBorad(Set sonBorad) {
		this.sonBorad = sonBorad;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBoradName() {
		return boradName;
	}
	public void setBoradName(String boradName) {
		this.boradName = boradName;
	}
	public String getBphoto() {
		return bphoto;
	}
	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
	}
}
