package com.javatechie.spring.cassandra.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.javatechie.spring.cassandra.api")
public class SpringBootCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);
	}
}
