package com.example.demo.controller;
/**
* @author Promise
* @createTime 2019年2月26日 上午10:24:59
* @description
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestLog {

	private final static Logger log = LoggerFactory.getLogger(TestLog.class);
	
	
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public void testLog() {
		log.trace("trace级别的日志");
		log.debug("debug级别日志");
		log.info("info级别日志");
		log.warn("warn级别的日志");
		log.error("error级别日志");
	}
}
