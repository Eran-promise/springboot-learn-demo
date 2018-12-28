package com.web.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.springbootconfig.entity.Blog;

/**
* @author Promise
* @createTime 2018年12月27日 下午10:30:18
* @description 
*/
@Controller
public class Test2Controller {

	@Autowired
	private Blog blog;
	
	@RequestMapping("/test2")
	@ResponseBody
	public String test2() {
		return "name="+blog.getName()+";pass="+blog.getPass()+";nick="+blog.getNick();
	}
}
