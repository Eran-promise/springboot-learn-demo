package com.web.springbootaoplog.service;

import com.web.springbootaoplog.entity.SysLog;

/**
* @author Promise
* @createTime 2018年12月18日 下午9:29:48
* @description 日志接口
*/
public interface ISysLogService {

	/**
	 * 插入日志
	 * @param entity
	 * @return
	 */
	int insertLog(SysLog entity);
}
