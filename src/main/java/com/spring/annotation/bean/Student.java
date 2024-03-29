package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
