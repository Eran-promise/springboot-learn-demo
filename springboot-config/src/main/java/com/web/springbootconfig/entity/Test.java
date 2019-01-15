package com.web.springbootconfig.entity;

import org.springframework.beans.factory.annotation.Value;

/**
* @author Promise
* @createTime 2019年1月14日 下午11:35:52
* @description 
*/
public class Test {

	@Value("${blog.login.name}")
	private String name;
	
	@Value("${blog.login.pass}")
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
