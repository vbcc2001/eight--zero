package com.bbs.vo;

public class Page {

	private int pagecount = 0;//总页数
	private int pagesize = 0;//每页显示条数
	private int size = 0;//总条数
	private int pagecode = 1; //当前页
	private String keyword;
	public int getPagecount() {
		return pagecount =  (this.size + this.pagesize - 1)/this.pagesize;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public Page()
	{}
	public Page(int pagesize, int size) {
		super();
		this.pagesize = pagesize;
		this.size = size;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPagecode() {
		return pagecode;
	}
	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	
}
