package com.bbs.struts2;

import java.util.List;
import java.util.Map;

import com.bbs.service.BoradTableService;
import com.opensymphony.xwork2.ActionContext;

public class BoradTableAction 
{
	private BoradTableService boradTableService;
	
	
	public void setBoradTableService(BoradTableService boradTableService) {
		this.boradTableService = boradTableService;
	}
	

	public String findAll() throws Exception
	{
		ActionContext context=ActionContext.getContext();
		List boradList = boradTableService.findAll();
		//((Map)context.get("request")).put("boradList", boradList);
		context.getSession().put("boradList", boradList);
		return "success";
	}

}
