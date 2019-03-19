package com.web.springbootehcache.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.web.springbootehcache.dao.SysUserMapper;
import com.web.springbootehcache.entity.SysUser;
import com.web.springbootehcache.service.IsysUserService;

/**
* @author Promise
* @createTime 2019年3月19日 下午3:26:54
* @description
*/
@Service("sysuserService")
public class SysUserServiceImpl implements IsysUserService{
	
	private final static Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);
	
	@Autowired
	private SysUserMapper sysuserMapper;

	@Override
	@Cacheable(value="userCache",key="#p0")
	public SysUser fingByPrimarykey(Integer key) {
		// TODO Auto-generated method stub
		log.debug("去数据库查询了数据！");
		return sysuserMapper.selectByPrimaryKey(key);
	}

	@Override
	@CachePut(value="userCache",key="#p0.id")
	public SysUser updateSysuser(SysUser entity) {
		// TODO Auto-generated method stub
		log.debug("更新了数据库数据！");
		int res = sysuserMapper.updateByPrimaryKey(entity);
		if(res >0)
			return entity;
		else
			return null;
	}

	@Override
	@CachePut(value="userCache",key="#entity.id")
	public SysUser insertSysuser(SysUser entity) {
		// TODO Auto-generated method stub		
		int res = sysuserMapper.insert(entity);
		log.debug("新增了数据！id为：{}",entity.getId());
		if(res >0)
			return entity;
		else
			return null;
	}

	@Override
	@CacheEvict(value="userCache",key="#p0",beforeInvocation=true)
	public int deleteByPrimarykey(Integer key) {
		// TODO Auto-generated method stub
		log.debug("删除了数据！");
		return sysuserMapper.deleteByPrimaryKey(key);
	}

}
