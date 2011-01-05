package com.bbs.dao;

import java.util.List;
import com.bbs.vo.MainTitle;
import com.bbs.vo.Page;

/**
 * 主题接口
 * @author Administrator
 *
 */

public interface ThemeDao {
	/**
	 * 增加帖子
	 * @throws Exception
	 */
	public void IncreaseTheme(MainTitle mainTitle)throws Exception;
	/**
	 * 批量删除帖子版主操作
	 * @param mainTitle
	 * @throws Exception
	 */
	public void DeleteTheme(int[] midList)throws Exception;
	/**
	 * 修改帖子
	 * @param mainTitle
	 * @throws Exception
	 */
	public void ModifyThreme(MainTitle mainTitle)throws Exception;
	/**
	 * 获得所有帖子
	 * @return
	 * @throws Exception
	 */
	public List<MainTitle> getMainTitles() throws Exception;
	
	/**
	 * 根据id查询帖子
	 * @param mid
	 * @return
	 * @throws Exception
	 */
	
	public MainTitle getMainTitleById(int mid)throws Exception;
	/**
	 * 分页操作
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<MainTitle> findAllMianTitles(Page page) throws Exception;
	public int getSize()throws Exception;
}
