package com.dreampig.arbitrationservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dreampig.arbitrationservice.mapper")
public class ArbitrationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArbitrationserviceApplication.class, args);
	}
}
