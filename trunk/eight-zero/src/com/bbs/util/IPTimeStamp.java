package com.bbs.util;

import java.text.SimpleDateFormat;
import java.util.Random;

public class IPTimeStamp {
	private String ip;

	public IPTimeStamp() {
	}

	public IPTimeStamp(String ip) {
		//设置ip地址
		this.ip = ip; 
	}

	public String getTimeStamp() {
		String temp = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		temp = sdf.format(new java.util.Date());
		return temp;
	}

	public String getIPTimeStampRand() {
		StringBuffer buf = new StringBuffer();
		if (ip != null) 
		{
			if(ip.indexOf(":")!=0)
			{
				String str[] = this.ip.split(":");
				for (int i = 0; i < str.length; i++) 
				{
				buf.append(str[i]);
				}
			}
			else
			{
				String str[] = this.ip.split("\\.");
				for (int i = 0; i < str.length; i++) {
					buf.append(this.addZero(str[i], 3));
				}
			}
			buf.append(this.getTimeStamp());
			Random rand = new Random();
			for (int i = 0; i < 3; i++) {
				buf.append(rand.nextInt(10)) ;
			}
		}
		return buf.toString() ;
	}

	private String addZero(String str, int len) {
		StringBuffer s = new StringBuffer();
		s.append(str);
		while (s.length() < len) {
			s.insert(0, "0");
		}
		return s.toString();
	}
}
