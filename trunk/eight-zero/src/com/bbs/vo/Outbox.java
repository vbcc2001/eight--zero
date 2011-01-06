package com.bbs.vo;

import java.util.Date;

public class Outbox {

	private int outboxid;					//收发邮件箱表ID
	private Userinfo fromUserinfo;			//发件人用户信息(如:ID)
	private String otitle;					//发信标题
	private String ocontent;				//发信内容
	private Date sendtime;					//发件人发信时间
	private Userinfo toUserinfo;			//收件人用户信息(如:ID)
	private int readStatus;					//邮件读取状态(0:已读;1:未读取)
	private String sendThing;				//邮件附件
	private int fromuidDel;					//发件人删除状态(0:已删;1未删)
	private int touidDel;					//收件人删除状态(0:已删;1未删)
	public int getOutboxid() {
		return outboxid;
	}
	public void setOutboxid(int outboxid) {
		this.outboxid = outboxid;
	}
	public Userinfo getFromUserinfo() {
		return fromUserinfo;
	}
	public void setFromUserinfo(Userinfo fromUserinfo) {
		this.fromUserinfo = fromUserinfo;
	}
	public String getOtitle() {
		return otitle;
	}
	public void setOtitle(String otitle) {
		this.otitle = otitle;
	}
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	public String getOcontent() {
		return ocontent;
	}
	public void setOcontent(String ocontent) {
		this.ocontent = ocontent;
	}
	public Userinfo getToUserinfo() {
		return toUserinfo;
	}
	public void setToUserinfo(Userinfo toUserinfo) {
		this.toUserinfo = toUserinfo;
	}
	public int getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(int readStatus) {
		this.readStatus = readStatus;
	}
	public String getSendThing() {
		return sendThing;
	}
	public void setSendThing(String sendThing) {
		this.sendThing = sendThing;
	}
	public int getFromuidDel() {
		return fromuidDel;
	}
	public void setFromuidDel(int fromuidDel) {
		this.fromuidDel = fromuidDel;
	}
	public int getTouidDel() {
		return touidDel;
	}
	public void setTouidDel(int touidDel) {
		this.touidDel = touidDel;
	}
}
