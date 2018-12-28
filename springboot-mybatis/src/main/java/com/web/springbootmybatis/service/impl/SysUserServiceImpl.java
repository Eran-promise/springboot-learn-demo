package com.web.springbootmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.springbootmybatis.dao.SysUserMapper;
import com.web.springbootmybatis.entity.SysUser;
import com.web.springbootmybatis.service.ISysUserService;

/**
* @author Promise
* @createTime 2018年12月27日 下午11:11:48
* @description 
*/
@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser findById(Long id) {
		// TODO Auto-generated method stub
		return sysUserMapper.findById(id);
	}

}
