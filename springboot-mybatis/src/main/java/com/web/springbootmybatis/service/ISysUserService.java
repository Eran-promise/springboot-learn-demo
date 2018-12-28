package com.web.springbootmybatis.service;
/**
* @author Promise
* @createTime 2018年12月27日 下午11:11:00
* @description 
*/

import com.web.springbootmybatis.entity.SysUser;

public interface ISysUserService {
	SysUser findById(Long id);
}
