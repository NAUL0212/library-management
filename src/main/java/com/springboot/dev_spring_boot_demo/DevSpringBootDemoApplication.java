package com.springboot.dev_spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
public class DevSpringBootDemoApplication {

		@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		return new HiddenHttpMethodFilter();
	}
	public static void main(String[] args) {
		SpringApplication.run(DevSpringBootDemoApplication.class, args);
	}

}
