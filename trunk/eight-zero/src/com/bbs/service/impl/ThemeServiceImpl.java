package com.bbs.service.impl;

import java.util.List;

import com.bbs.dao.ThemeDao;
import com.bbs.service.ThemeService;
import com.bbs.vo.MainTitle;
import com.bbs.vo.Page;

public class ThemeServiceImpl implements ThemeService {
	private ThemeDao themeDao;

	public void setThemeDao(ThemeDao themeDao) {
		this.themeDao = themeDao;
	}
/**
 * 批量删除帖子
 */
	public void DeleteTheme(int[] midList) {
		// TODO Auto-generated method stub
			try {
				this.themeDao.DeleteTheme(midList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
/**
 * 增加帖子
 */
	public void IncreaseTheme(MainTitle mainTitle) {
		// TODO Auto-generated method stub
		try {
			this.themeDao.IncreaseTheme(mainTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 修改帖子
 */
	public void ModifyThreme(MainTitle mainTitle) {
		// TODO Auto-generated method stub
		try {
			this.themeDao.ModifyThreme(mainTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 分页读贴
 */
	public List<MainTitle> findAllMianTitles(Page page) {
		// TODO Auto-generated method stub
		List<MainTitle> list = null;
		try {
			list = this.themeDao.findAllMianTitles(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
/**
 * 根据id读贴
 */
	public MainTitle getMainTitleById(int mid) {
		// TODO Auto-generated method stub
		MainTitle mainTitle = null;
		try {
			mainTitle = this.themeDao.getMainTitleById(mid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mainTitle;
	}
/**
 * 获得所有帖子(后台)
 */
	public List<MainTitle> getMainTitles() {
		// TODO Auto-generated method stub
		List<MainTitle> list = null;
		try {
			list = this.themeDao.getMainTitles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		int row = 0;
		try {
			row = this.themeDao.getSize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

}
