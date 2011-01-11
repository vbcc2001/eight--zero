package com.bbs.struts2;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.bbs.service.ThemeService;
import com.bbs.vo.MainTitle;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * modelDriven:
 * @author Administrator
 *
 */
public class MainTitleAction extends ActionSupport implements ModelDriven<MainTitle> {
	private MainTitle mt  = new MainTitle();
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
		//mt.setMid(Integer.parseInt(request.getParameter("mid")));
		mt.setMtitle(request.getParameter("mtitle"));
		mt.setMcontent(request.getParameter("mcontent"));
		mt.setMtime(new Date());
		System.out.println(new Date()+"==============");
		System.out.println(request.getParameter("mtitle") + "...........");
		System.out.println(request.getParameter("mcontent") + "===============");
		try {
			this.themeService.IncreaseTheme(mt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
