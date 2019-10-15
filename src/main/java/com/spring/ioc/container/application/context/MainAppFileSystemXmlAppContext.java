package com.spring.ioc.container.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.ioc.container.bean.HelloWorldBean;

public class MainAppFileSystemXmlAppContext {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\workspaceTrunk\\tianyi-spring-test\\src\\main\\resources\\IocContainerBeans.xml");
		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloWorld");
		obj.getMessage();
		System.out.println("From Class: " + Thread.currentThread().getStackTrace()[1].getClassName());
	}
}
