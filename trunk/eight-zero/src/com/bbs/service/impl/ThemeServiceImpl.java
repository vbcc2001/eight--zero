package com.bbs.service.impl;

import java.util.List;

import com.bbs.dao.BaseDao;
import com.bbs.dao.ThemeDao;
import com.bbs.service.ThemeService;
import com.bbs.vo.MainTitle;
import com.bbs.vo.Page;

public class ThemeServiceImpl implements ThemeService {
	private BaseDao baseDao;
	private MainTitle mt = new MainTitle();
	
public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
/**
 * 批量删除帖子
 */
	public void DeleteTheme(int[] midList) {
			try {
				//this.baseDao.delete(object);
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
			this.baseDao.add(this.mt);
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
			this.baseDao.update(this.mt);
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
		String hql="";
			try {
				List<Object> list1 = this.baseDao.select(hql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}
/**
 * 根据id读贴(后台)
 */
	public MainTitle getMainTitleById(int mid) {
		
		// TODO Auto-generated method stub
		MainTitle mainTitle = null;
		try {
			mainTitle = (MainTitle) this.baseDao.byIdSelect(MainTitle.class, mid);
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
		List<Object> list1=null;
		String hql="";
		try {
			list1 =  this.baseDao.select(hql);
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
			//row = this.baseDao.getSize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	public void delete(int id) throws Exception {
			this.baseDao.delete(MainTitle.class, id);
	}

}
