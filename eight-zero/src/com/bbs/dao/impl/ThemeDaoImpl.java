package com.bbs.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.bbs.dao.ThemeDao;
import com.bbs.vo.MainTitle;
import com.bbs.vo.Page;

public class ThemeDaoImpl extends HibernateDaoSupport implements ThemeDao {
	
	private ThemeDao themeDao;

	public void setThemeDao(ThemeDao themeDao) {
		this.themeDao = themeDao;
	}
	/**
	 * 批量删除帖子版主操作
	 */

	public void DeleteTheme(int[] midList) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<midList.length;i++){
				MainTitle mainTitle = this.getHibernateTemplate().load(MainTitle.class, midList[i]);
				this.getHibernateTemplate().delete(mainTitle);
			}
		} catch (DataAccessException e) {
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
			this.getHibernateTemplate().save(mainTitle);
		} catch (DataAccessException e) {
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
			this.getHibernateTemplate().saveOrUpdate(mainTitle);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 根据id查询帖子版主操作
	 */

	public MainTitle getMainTitleById(int mid) {
		// TODO Auto-generated method stub
		MainTitle mainTitle = null;
		try {
			mainTitle = this.getHibernateTemplate().load(MainTitle.class, mid);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mainTitle;
	}

	/**
	 * 获得所以帖子
	 */
	@SuppressWarnings("unchecked")
	public List<MainTitle> getMainTitles() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		List<MainTitle> list = null;
		list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				return session.createQuery("from MainTitle");
			}
		});
		return list;
	}

	/**
	 * 分页
	 */
	public List<MainTitle> findAllMianTitles(Page page) {
		// TODO Auto-generated method stub
		List<MainTitle> list = null;
		Query query = null;
		String hql="from MainTitle";
		try {
			query = this.getSession().createQuery(hql);
			query.setFirstResult(page.getPagesize() * page.getPagecode()-page.getPagesize());
			query.setMaxResults(page.getPagesize());
			list = query.list();
		} catch (DataAccessResourceFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from MainTitle").size();
	}

}
