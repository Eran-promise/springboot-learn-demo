package com.web.springbootdruid.service;

import com.web.springbootdruid.entity.SysUser;

/**
* @author Promise
* @createTime 2018年12月27日 下午11:11:00
* @description 
*/


public interface ISysUserService {
	SysUser findById(Long id);
}
