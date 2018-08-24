package com.qiubit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QiubitApplication {

	private final Logger logger =  LoggerFactory.getLogger(QiubitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(QiubitApplication.class, args);
	}
}
