package com.example.demospringboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class DemoSpringBoot1Application {

	public static void main(String[] args) {

		SpringApplication.run(DemoSpringBoot1Application.class, args);
	}

}
