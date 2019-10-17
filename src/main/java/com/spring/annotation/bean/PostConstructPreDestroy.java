package com.spring.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class PostConstructPreDestroy {
	private String message;
	// Resource和autowire类似，只是属于javax而不是spring，是byName的，autowire是byType
	@Resource
	@Qualifier("student1")
	private Student student;

	@Resource(name = "message")
	public void setMessage(String message) {
		this.message = message;
	}

	public void printMessage() {
		System.out.println("Your Message : " + message);
	}

	// 声明一个构造方法完成后调用的方法
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init..." + student.getName() + " " + student.getAge());
	}

	// 声明一个销毁对象前调用的方法
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now..." + student.getName() + " " + student.getAge());
	}
}
