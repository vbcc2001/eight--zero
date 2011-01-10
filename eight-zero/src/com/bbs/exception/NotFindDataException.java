package com.bbs.exception;

public class NotFindDataException extends Exception 
{
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public NotFindDataException(String msg)
	{
		super();
		this.msg = msg;
	}
}
