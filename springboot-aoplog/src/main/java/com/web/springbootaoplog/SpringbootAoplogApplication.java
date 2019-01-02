package com.web.springbootaoplog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.web.springbootaoplog.dao")
public class SpringbootAoplogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAoplogApplication.class, args);
	}

}

