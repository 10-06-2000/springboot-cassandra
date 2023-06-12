package com.javatechie.spring.cassandra.api.model;

import lombok.Builder;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@NoArgsConstructor
public class User {

	@PrimaryKey
	private int id;
	private String name;
	private String address;
	private int age;

	public User(int id, String name, String address, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
