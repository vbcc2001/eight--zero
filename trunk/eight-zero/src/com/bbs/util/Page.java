
package com.bbs.util;

import java.io.Serializable;

/**
 * 用于WEB分页的一个通用类，包含4个属性：<br>
 * 总条数（allCount）,allPage(总页数),currentPage(当前页),pageSize(每页显示数)<br>
 * 关系:allPage = (allCount+pageSize-1)/pageSize
 * @author xxxman ,2010/11/24
 * @version 1.00
 * @since
 */

public class Page implements Serializable {
	
	//每页显示的数量
	private int pageSize ;
	//当前页
	private int currentPage ;
	//总页数
	private int allPage ;
	//总记录条数
	private int allCount;
	//模糊查询关键字
	private String keyWord;
		
	/**
	 * 带参构造函数,当前页默认为1
	 * @param allCount 设置总条数,应>=0条,负数自动设为0
	 * @param pageSize	设置每页显示数,应>=1条,否则自动设置为10
	 */
	public  Page(int allCount,int pageSize)
	{
		this.currentPage = 1;
		if(pageSize<=0)
		{
			System.out.println("---Page类：每页显示数参数错误，自动设置为10---");
			this.pageSize=10;
		}
		else 
		{
			this.pageSize =pageSize;
		}
		if(allCount<0)
		{
			System.out.println("---Page类：总条数参数错误，自动设置为0---");
			this.allCount = 0; 
		}
		else 
		{
			this.allCount = allCount;
		}
		this.allPage = (this.allCount+this.pageSize-1)/this.pageSize;
		
	}
	/**
	 * 无参构造函数,默认:当前页为1,每页显示数为10,总条数,总页数为0
	 */
	public  Page()
	{
		this.currentPage = 1;
		this.allCount = 0;
		this.allPage =0;
		this.pageSize =10;
	}
	/**
	 * 获得每页显示数
	 * @return 每页显示数
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * 设置每页显示数
	 * @param pageSize 每页显示数,应>=1条,否则无效
	 */
	public void setPageSize(int pageSize) {
		if(pageSize>=1)
		{
			this.pageSize = pageSize;
		}
		else
		{
			System.out.println("---Page类：每页显示数设置失败，参数错误---");
		}
		this.allPage = (this.allCount+this.pageSize-1)/this.pageSize;
	}
	
	/**
	 * 获得当前页
	 * @return	当前页
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	
	/**
	 * 设置当前页
	 * @param currentPage 当前页>=1,否则无效,
	 * 
	 */
	public void setCurrentPage(int currentPage) {
		if(currentPage >= 1)
		{
			this.currentPage = currentPage;
		}
		else
		{
			System.out.println("---Page类：当前页设置失败，参数错误---");
		}
	}
	
	/**
	 *	获得总页数
	 * @return	总页数
	 */
	public int getAllPage() {
		return allPage;
	}
	
	/**
	 * 获得总条数
	 * @return	总条数
	 */
	public int getAllCount() {
		return allCount;
	}
	
	/**
	 * 设置总条数
	 * @param allCount 总条数,>=0,否则无效
	 */
	public void setAllCount(int allCount) {
		
		if(allCount>=0)
		{
			this.allCount = allCount;
			this.allPage = (this.allCount+this.pageSize-1)/this.pageSize;
		}
		else
		{
			System.out.println("---Page类：当前页设置失败，参数错误---");
		}
		
	}
}