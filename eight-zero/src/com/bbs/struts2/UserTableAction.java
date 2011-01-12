package com.bbs.struts2;

import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.bbs.service.impl.IUserTableServiceimpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserTableAction extends ActionSupport {

	private String uname; // 用户名(账号)
	private String upwd; // 用户密码
	private String upwd2; // 第二次用户密码
	private String uemail; // 用户邮箱
	private int sex; // 用户性别(1:男生;0:女生)
	private IUserTableServiceimpl iuserTableServiceimpl;

	public String getUpwd2() {
		return upwd2;
	}

	public void setUpwd2(String upwd2) {
		this.upwd2 = upwd2;
	}

	public void setIuserTableServiceimpl(
			IUserTableServiceimpl iuserTableServiceimpl) {
		this.iuserTableServiceimpl = iuserTableServiceimpl;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 检查用户名是否存在
	 * 
	 * @return
	 */
	public String checkUser() {
		try {
			HttpServletResponse res = ServletActionContext.getResponse();
			PrintWriter out = res.getWriter();
			System.out.println(this.uname);
			if (this.uname == null || "".equals(this.uname.trim())) {
				this.addFieldError("suserName", "用户名不能为空***");
				//out.print("<script>alert('dd');</script>");
				return "input";
			} else {
				if (!Pattern.compile("^[a-zA-Z0-9]{1}[a-zA-Z0-9_]{3,15}$")
						.matcher(this.uname).matches()) {
					System.out.println("cc");
					this.addFieldError("suserName", "用户名格式错误----");
					return "input";
				} else {
					System.out.println("bb");
					out.print("");
					if (iuserTableServiceimpl.checkUser(uname)) {
						out.print("可以使用!");
					} else {
						out.print("不可以使用!");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("来到这");
		return null;
	}

	/*
	 * 检查email是否可以使用
	 */
	public String checkEmail() {
		try {
			HttpServletResponse res = ServletActionContext.getResponse();
			PrintWriter out = res.getWriter();
			System.out.println(this.uemail);
			if (this.uemail == null || "".equals(this.uemail.trim())) {
				this.addFieldError("suemail", "邮箱不能为空");
				return "input";
			} else {
				if (!Pattern.compile(
						"^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$")
						.matcher(this.uemail).matches()) {
					this.addFieldError("suemail", "邮箱号格式不正确");
					return "input";
				} else {
					if (iuserTableServiceimpl.checkEmail(uemail)) {
						out.print("邮箱可以使用!");
					} else {
						out.print("邮箱不可以使用!");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	public void validate() {
//
//		if (this.uname == null || "".equals(this.uname.trim())) {
//			this.addFieldError("suserName", "用户名不能为空***");
//		} else {
//			if (!Pattern.compile("^[a-zA-Z0-9]{1}[a-zA-Z0-9_]{3,15}$").matcher(
//					this.uname).matches())
//				this.addFieldError("userName", "用户名格式错误----");
//			else {
//				System.out.println("bb");
//				checkUser();
//			}
//		}
//		if (this.upwd == null || "".equals(this.upwd)) {
//			this.addFieldError("supwd", "请输入密码***");
//		} else {
//			if (!Pattern.compile("^\\w{6,20}$").matcher(this.upwd).matches()) {
//				this.addFieldError("supwd", "请输入6~20位的密码----");
//			}
//		}
//		if (this.upwd2 == null || "".equals(this.upwd2)) {
//			this.addFieldError("supwd2", "请输入密码***");
//		} else {
//			if (this.upwd != this.upwd2) {
//				this.addFieldError("supwd2", "两次密码不同，请重新输入");
//			}
//		}
//		if (this.uemail == null || "".equals(this.uemail.trim())) {
//			this.addFieldError("suemail", "邮箱不能为空");
//		} else {
//			if (!Pattern.compile(
//					"^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$")
//					.matcher(this.uemail).matches()) {
//				this.addFieldError("suemail", "邮箱号格式不正确");
//			}
//		}
//	}

}
