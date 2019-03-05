package org.demo.app.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/*
 * author Debu
 */

@SpringBootApplication
@ComponentScan(basePackages={"org.demo.app.controller"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
