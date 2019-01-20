package com.web.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.web.springboot.dao")
public class SpringbootGeneratorPagehelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGeneratorPagehelperApplication.class, args);
	}

}

