package com.kite.search.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages="com.kite.search.controller")
public class Bootstrap {
	public static void main(String[] args) {
		 SpringApplication.run(Bootstrap.class, args);
	}
}
