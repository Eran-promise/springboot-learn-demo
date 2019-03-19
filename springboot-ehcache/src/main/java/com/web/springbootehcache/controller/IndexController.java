package com.web.springbootehcache.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.springbootehcache.entity.SysUser;
import com.web.springbootehcache.service.IsysUserService;

/**
* @author Promise
* @createTime 2019年3月19日 下午1:48:13
* @description
*/
@RestController
public class IndexController {
	
	private final static Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private IsysUserService sysuserService;

	@RequestMapping(value="/select/{id}")
	public Object index(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<>();
		SysUser sysuser = sysuserService.fingByPrimarykey(id);
		log.debug("查询了id为:{}的用户信息！",sysuser.getId());
		SysUser sysuser2 = sysuserService.fingByPrimarykey(id);
		log.debug("查询了id为:{}的用户信息！",sysuser2.getId());
		map.put("res", sysuser);
		return map;
	}
	
	@RequestMapping(value="/update")
	public Object update() {
		Map<String, Object> map = new HashMap<>();
		//第一次修改
		SysUser sysuser = new SysUser(1, "eran", "eran1", 20, "M");
		sysuserService.updateSysuser(sysuser);
		//第一次查询
		sysuser = sysuserService.fingByPrimarykey(1);
		log.debug("查询了id为:{}的用户信息！",sysuser.getId());
		//第2次修改
		sysuser = new SysUser(1, "eran", "eran2", 20, "M");
		sysuserService.updateSysuser(sysuser);
		//第2次查询
		sysuser = sysuserService.fingByPrimarykey(1);
		log.debug("查询了id为:{}的用户信息！",sysuser.getId());
 		map.put("res", sysuser);
		return map;
	}
	
	@RequestMapping(value="/insert")
	public Object insert() {
		Map<String, Object> map = new HashMap<>();
		SysUser sysuser = new SysUser();
		sysuser.setName("admin");
		sysuser.setAge(22);
		sysuser.setPass("admin");
		sysuser.setSex("M");
		sysuserService.insertSysuser(sysuser);
		//查询
		sysuser = sysuserService.fingByPrimarykey(sysuser.getId());
		map.put("res", sysuser);
		return map;
	}
	
	@RequestMapping(value="/delete/{id}")
	public Object delete(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<>();
		sysuserService.deleteByPrimarykey(id);
		//查询
		SysUser sysuser = sysuserService.fingByPrimarykey(id);
		map.put("res", sysuser);
		return map;
	}
}
