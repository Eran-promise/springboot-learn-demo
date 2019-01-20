package com.web.springboot.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.web.springboot.entity.SysUser;

/**
* @author Promise
* @createTime 2019年1月20日 下午8:31:09
* @description 
*/
public interface ISysUserService extends IBaseService<SysUser>{

	/**
	 * 分页查询，返回list数据
	 * @param pageNum 当前页
	 * @param pageSize 每页包含多少条数据
	 * @return
	 */
	List<SysUser> findAllByPage(int pageNum, int pageSize);
	
	PageInfo<SysUser> findAllByPage2(int pageNum, int pageSize);
}
