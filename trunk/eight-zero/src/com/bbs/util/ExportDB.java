package com.bbs.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
/**
 * 根据实体对象生成表对象
 * @author eduask.luohui
 */
public class ExportDB 
{
	public static void main(String[] args) 
	{
		//读取hibernate.cfg.xml文件
		Configuration cfg = new Configuration().configure();
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);
	}
}
