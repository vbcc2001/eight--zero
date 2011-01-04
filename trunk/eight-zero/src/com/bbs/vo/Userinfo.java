package com.bbs.vo;

import java.util.Set;

public class Userinfo {

	private int uid;				//用户ID
	private String nickname;		//用户匿称
	private String signature;		//用户个性签名
	private String addr;			//用户住址
	private String tel;				//用户电话
	private String uphoto;			//用户头像
	private String uhobby;			//用户爱好
	private int uscore;				//用户积分
	private int bbscurrency;		//用户金币
	private int onlineTime;			//用户在线时间
	private int onlineStatus;		//用户在线状态((0:下线;1:上线)
	private int ulevel;				//用户级别(0:普通用户;1班主)
	private UserTable userTable;	//用户注册表信息
	private Set mainTitle;			//主题表信息(如:ID)
	private Set replay;				//回复表信息(如:ID)
	private Set outbox;				//收发邮件表信息
	
	public Set getMainTitle() {
		return mainTitle;
	}
	public void setMainTitle(Set mainTitle) {
		this.mainTitle = mainTitle;
	}
	public Set getReplay() {
		return replay;
	}
	public void setReplay(Set replay) {
		this.replay = replay;
	}
	public Set getOutbox() {
		return outbox;
	}
	public void setOutbox(Set outbox) {
		this.outbox = outbox;
	}
	public int getBbscurrency() {
		return bbscurrency;
	}
	public void setBbscurrency(int bbscurrency) {
		this.bbscurrency = bbscurrency;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}
	public String getUhobby() {
		return uhobby;
	}
	public void setUhobby(String uhobby) {
		this.uhobby = uhobby;
	}
	public int getUscore() {
		return uscore;
	}
	public void setUscore(int uscore) {
		this.uscore = uscore;
	}
	public int getOnlineTime() {
		return onlineTime;
	}
	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}
	public int getOnlineStatus() {
		return onlineStatus;
	}
	public void setOnlineStatus(int onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	public int getUlevel() {
		return ulevel;
	}
	public void setUlevel(int ulevel) {
		this.ulevel = ulevel;
	}
	public UserTable getUserTable() {
		return userTable;
	}
	public void setUserTable(UserTable userTable) {
		this.userTable = userTable;
	}
}
