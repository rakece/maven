package com.kirusa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class RcsbotdirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RcsbotdirectoryApplication.class, args);
	}

}
