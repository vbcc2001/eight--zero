package com.bbs.struts2;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.bbs.service.ThemeService;
import com.bbs.vo.MainTitle;
import com.bbs.vo.Userinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * modelDriven:
 * @author Administrator
 *
 */
public class MainTitleAction extends ActionSupport implements ModelDriven<MainTitle> {
	private MainTitle mt ;
	private ThemeService themeService;
	private String message;
	public void setThemeService(ThemeService themeService) {
		this.themeService = themeService;
	}

	public MainTitle getMt() {
		return mt;
	}

	public void setMt(MainTitle mt) {
		this.mt = mt;
	}
	public MainTitle getModel() {
		return mt;
	}
	public String select()
	{
		
		return SUCCESS;
	}
	/**
	 * 删除
	 * @return
	 */
	public String delete()
	{
		try {
			this.themeService.delete(this.mt.getMid());
			message="delete success";
		} catch (Exception e) {
			message="delete failure";
		}
		ServletActionContext.getRequest().setAttribute("message", message);
		return SUCCESS;
	}
	/**
	 * 发表帖子
	 * @return
	 */
	public String IncreaseTheme(){
		HttpServletRequest request = ServletActionContext.getRequest();
		mt.setMtime(new Date());
		mt.setCheckcount(0);
		Userinfo u = new Userinfo();
		u.setUid(2);
		mt.setUserinfo(u);
		//mt
		try {
			this.themeService.IncreaseTheme(mt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String getType(){
		ActionContext context = ActionContext.getContext();
		List list = null;
		try {
			list = this.themeService.findall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.getSession().put("list", list);
		return "gettype_success";
	}
}
