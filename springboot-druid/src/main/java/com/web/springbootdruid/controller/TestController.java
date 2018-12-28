package com.web.springbootdruid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.springbootdruid.entity.SysUser;
import com.web.springbootdruid.service.ISysUserService;


/**
* @author Promise
* @createTime 2018年12月27日 下午11:13:22
* @description 
*/
@RestController
public class TestController {

	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping("/user")
	public SysUser getUser() {
		return sysUserService.findById(1L);
	}
}
