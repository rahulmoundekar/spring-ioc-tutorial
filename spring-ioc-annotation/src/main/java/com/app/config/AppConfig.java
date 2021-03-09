package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.app.pojo.Address;
import com.app.pojo.Student;

@Configuration
public class AppConfig {

	@Bean
	@Scope("prototype")
	public Student getStudentInstance() {
		return new Student(101, "Rahul", getAddressInstance());
	}

	@Bean
	public Address getAddressInstance() {
		return new Address("Pune");
	}

}
