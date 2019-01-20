package com.web.springboot.service;

import java.util.List;

/**
* @author Promise
* @createTime 2019年1月20日 下午8:24:40
* @description service接口层基类，包含基本的	CRUD操作。
*/
public interface IBaseService<T> {
	
	/**
	 * 根据主键删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Object id);

	/**
	 * 新增一条记录
	 * @param entity
	 * @return
	 */
    int insert(T entity);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    T selectByPrimaryKey(Object id);

    /**
     * 查询全部记录
     * @return
     */
    List<T> selectAll();

    /**
     * 根据主键修改数据
     * @param entity
     * @return
     */
    int updateByPrimaryKey(T entity);
}
