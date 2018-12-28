package com.web.springbootconfig.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
* @author Promise
* @createTime 2018年12月27日 下午10:28:22
* @description 
*/
@Component
public class Blog {

	@Value("${blog.login.name}")
	private String name;
	
	@Value("${blog.login.pass}")
	private String pass;
	
	@Value("${blog.nick}")
	private String nick;

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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
}
