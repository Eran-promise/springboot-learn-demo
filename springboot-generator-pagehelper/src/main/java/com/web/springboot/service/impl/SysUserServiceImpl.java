package com.web.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
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
//		PageHelper.startPage(pageNum, pageSize);
//		List<SysUser> lists = sysUserMapper.selectAll();
		//这种写法需要jdk8 lambda用法
//		Page<SysUser> page = PageHelper.startPage(pageNum, pageSize).doSelectPage(()-> sysUserMapper.selectAll());
		//如果是低版本的jdk,则使用如下写法（两种写法根据自己jdk版本二选一）
		Page<SysUser> page = PageHelper.startPage(pageNum, pageSize).doSelectPage(new ISelect() {
			
			@Override
			public void doSelect() {
				// TODO Auto-generated method stub
				sysUserMapper.selectAll();
			}
		});
		return page;
	}

	@Override
	public PageInfo<SysUser> findAllByPage2(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
//		PageHelper.startPage(pageNum, pageSize);
//		List<SysUser> lists = sysUserMapper.selectAll();
//		PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(lists);
		//这种写法需要jdk8 lambda用法
//		PageInfo<SysUser> pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(()-> sysUserMapper.selectAll());
		//如果是低版本的jdk,则使用如下写法（两种写法根据自己jdk版本二选一）
		PageInfo<SysUser> pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(new ISelect() {
			
			@Override
			public void doSelect() {
				// TODO Auto-generated method stub
				sysUserMapper.selectAll();
			}
		});
		return pageInfo;
	}
}
