package com.spring.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.HelloWorld;

public class MainAppFileSystemXmlAppContext {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\workspaceTrunk\\tianyi-spring-test\\src\\main\\resources\\Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		System.out.println("From Class: " + Thread.currentThread().getStackTrace()[1].getClassName());
	}
}
