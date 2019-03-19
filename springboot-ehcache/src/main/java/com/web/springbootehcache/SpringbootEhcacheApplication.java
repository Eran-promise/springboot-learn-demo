package com.web.springbootehcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.web.springbootehcache.dao")
@EnableCaching
public class SpringbootEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEhcacheApplication.class, args);
	}

}
