package com.qiubit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class QiubitApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(QiubitApplication.class, args);
	}
}
