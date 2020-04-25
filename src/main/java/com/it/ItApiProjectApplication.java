package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.it.*","com.it.dao"})
public class ItApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItApiProjectApplication.class, args);
	}

}
