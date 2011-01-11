package com.bbs.struts2;

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
	public String delete()
	{
		try {
			this.themeService.delete(this.mt.getMid());
			message="delete success";
		} catch (Exception e) {
			message="delete failure";
			System.out.println("");
		}
		ServletActionContext.getRequest().setAttribute("message", message);
		return SUCCESS;
	}
	
	
}
