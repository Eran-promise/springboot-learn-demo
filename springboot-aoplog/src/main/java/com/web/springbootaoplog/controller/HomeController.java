package com.web.springbootaoplog.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.springbootaoplog.config.Log;

/**
* @author Promise
* @createTime 2019年1月2日 下午10:35:30
* @description  测试controller
*/
@Controller
public class HomeController {

	@RequestMapping("/aop")
	@ResponseBody
	@Log("测试aoplog")
	public Object aop() {
		Map<String, Object> map =new HashMap<>();
		map.put("res", "ok");
		return map;
	}
}
