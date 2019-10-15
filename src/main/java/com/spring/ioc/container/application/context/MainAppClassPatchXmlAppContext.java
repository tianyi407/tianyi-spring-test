package com.spring.ioc.container.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.container.bean.HelloWorldBean;

public class MainAppClassPatchXmlAppContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("IocContainerBeans.xml");
		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloWorld");
		obj.getMessage();
		System.out.println("From Class: " + Thread.currentThread().getStackTrace()[1].getClassName());
	}
}
