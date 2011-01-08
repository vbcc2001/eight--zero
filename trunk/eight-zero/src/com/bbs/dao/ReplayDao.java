package com.bbs.dao;

import java.util.List;

import com.bbs.vo.Page;
import com.bbs.vo.Replay;

public interface ReplayDao {
	
	
	/**
	 * 增加回复
	 * @throws Exception
	 */
	public void addReplay(Replay replay) throws Exception;
	
	/**
	 * 修改回复
	 * @throws Exception
	 */
	public void modifyReplay(Replay replay) throws Exception;
	
	/**
	 * 屏蔽回复
	 * @throws Exception
	 */
	public void shieldReplay(Replay replay) throws Exception;
	
	/**
	 * 查询所有回复
	 * @return
	 * @throws Exception
	 */
	public List queryAllReplay(int mid ,Page page) throws Exception;
	
}
