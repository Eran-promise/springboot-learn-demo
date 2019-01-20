package com.web.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.web.springboot.entity.SysUser;
import com.web.springboot.service.ISysUserService;

/**
* @author Promise
* @createTime 2019年1月20日 下午8:21:02
* @description 
*/
@RestController
public class TestController {
	
	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping("/user")
	public Object getUser() {
		SysUser entity = sysUserService.selectByPrimaryKey(1);
		return entity;
	}

	@RequestMapping("/users/{pageNum}/{pageSize}")
	public Object getAllUser(@PathVariable int pageNum, @PathVariable int pageSize) {
		List<SysUser> lists=sysUserService.findAllByPage(pageNum, pageSize);
		return lists;
	}
	
	@RequestMapping("/users2/{pageNum}/{pageSize}")
	public Object getAllUser2(@PathVariable int pageNum, @PathVariable int pageSize) {
		PageInfo<SysUser> pageInfo=sysUserService.findAllByPage2(pageNum, pageSize);
		return pageInfo;
	}
}
