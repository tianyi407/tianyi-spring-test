package com.spring.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.HelloWorld;

public class MainAppClassPatchXmlAppContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		System.out.println("From Class: " + Thread.currentThread().getStackTrace()[1].getClassName());
	}
}
