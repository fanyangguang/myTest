package com.fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(value = {"com.fan"})
@EnableAsync
@ImportResource(locations = { "classpath:mybatis/mapper/**/*.xml"})
public class HystrixProductApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HystrixProductApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HystrixProductApplication.class);
	}
}
