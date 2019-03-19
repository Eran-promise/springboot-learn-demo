package com.web.springbootehcache.entity;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer id;

    private String name;

    private String pass;

    private String sex;

    private Integer age;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public SysUser() {}
    
    public SysUser(Integer id,
    		String name,
    		String pass,
    		Integer age,
    		String sex) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	this.pass=pass;
    	this.sex=sex;
    }
}