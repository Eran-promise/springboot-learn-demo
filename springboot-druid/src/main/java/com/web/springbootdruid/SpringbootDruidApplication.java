package com.web.springbootdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.web.springbootdruid.dao")
public class SpringbootDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDruidApplication.class, args);
	}

}

