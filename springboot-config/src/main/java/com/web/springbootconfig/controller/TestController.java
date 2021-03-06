package com.web.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.springbootconfig.entity.Test;

/**
* @author Promise
* @createTime 2018年12月27日 下午10:11:35
* @description 
*/
@Controller
public class TestController {
	
	@Value("${blog.login.name}")
	private String name;
	
	@Value("${blog.login.pass}")
	private String pass;
	
	@Value("${blog.nick}")
	private String nick;
	
	@RequestMapping("/test")
	@ResponseBody
	public String configTest() {
		return "name="+name+";pass="+pass;
	}
	
	@RequestMapping("/check")
	@ResponseBody
	public String check() {
		Test test =new Test();
		return "name="+test.getName()+";pass="+test.getPass();
	}
}
