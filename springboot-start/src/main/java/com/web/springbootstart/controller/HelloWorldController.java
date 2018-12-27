package com.web.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Promise
* @createTime 2018年12月27日 下午9:30:32
* @description 
*/
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
