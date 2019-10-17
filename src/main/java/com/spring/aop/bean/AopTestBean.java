package com.spring.aop.bean;

public class AopTestBean {
	private int age;
	private String name;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("AopTestBean.getAge(): " + age);
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void appendAgeName() {
		System.out.println("AopTestBean.appendAgeName(): " + age + name);
	}

	public String getName() {
		System.out.println("AopTestBean.getName(): " + name);
		return name;
	}

	public void printThrowException() {
		System.out.println("AopTestBean.printThrowException() ...F");
		throw new IllegalArgumentException();
	}

}
