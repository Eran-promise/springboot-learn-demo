package com.web.springbootehcache.service;
/**
* @author Promise
* @createTime 2019年3月19日 下午3:26:42
* @description
*/

import com.web.springbootehcache.entity.SysUser;

public interface IsysUserService {

	SysUser fingByPrimarykey(Integer key);
	
	SysUser updateSysuser(SysUser entity);
	
	SysUser insertSysuser(SysUser entity);
	
	int deleteByPrimarykey(Integer key);
}
