package com.bbs.util;
import java.security.MessageDigest;

public class Md5 {

	private static String password = "";

	/**
	 * 传入一个字符串进行MD5加密
	 * @param s  要加密的字符串
	 * @return 加密好的字符串
	 */
	public static String getMd5(String s) {
		password = s;
		// 用来加密会出现的字符
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
				'y', 'z' };
		try {
			byte[] strTemp = password.getBytes();// 将传过来的字符串转为字节数组
			MessageDigest md = MessageDigest.getInstance("MD5");// 产生一个MD5的对象
			md.update(strTemp);// 加入一个算法
			byte[] b = md.digest();
			int j = b.length;
			char str[] = new char[j * 2];// 将一个字节数组转为一个字符数组
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = b[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			System.out.print("Md5 ---------- getMd5");
			return null;
		}
	}
}
