package com.bbs.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bbs.dao.ReplayDao;
import com.bbs.vo.Page;
import com.bbs.vo.Replay;


public class ReplayDaoImpl extends HibernateDaoSupport implements ReplayDao {

	private ReplayDao replaydao;
	
	public void setReplaydao(ReplayDao replaydao) {
		this.replaydao = replaydao;
	}

	/**
	 * 增加回复
	 */
	public void addReplay(Replay replay) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(replay);

	}

	/**
	 * 修改回复
	 */
	public void modifyReplay(Replay replay) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 屏蔽回复
	 */
	public void shieldReplay(Replay replay) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 查询所有回复
	 */
	public List queryAllReplay(int mid, Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
