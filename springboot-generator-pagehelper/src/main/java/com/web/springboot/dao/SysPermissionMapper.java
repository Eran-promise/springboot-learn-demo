package com.web.springboot.dao;

import com.web.springboot.entity.SysPermission;
import java.util.List;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPermission record);

    SysPermission selectByPrimaryKey(Integer id);

    List<SysPermission> selectAll();

    int updateByPrimaryKey(SysPermission record);
}