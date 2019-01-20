package com.web.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.springboot.dao.SysUserMapper;
import com.web.springboot.entity.SysUser;
import com.web.springboot.service.ISysUserService;

/**
* @author Promise
* @createTime 2019年1月20日 下午8:31:50
* @description 
*/
@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public int deleteByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SysUser entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser selectByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectByPrimaryKey((Integer)id);
	}

	@Override
	public List<SysUser> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(SysUser entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysUser> findAllByPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SysUser> lists = sysUserMapper.selectAll();
		return lists;
	}

	@Override
	public PageInfo<SysUser> findAllByPage2(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SysUser> lists = sysUserMapper.selectAll();
		PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(lists);
		return pageInfo;
	}
}
