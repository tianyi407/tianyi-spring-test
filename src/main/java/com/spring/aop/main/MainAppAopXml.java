package com.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import com.spring.aop.bean.AopTestBean;

public class MainAppAopXml {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AopBeans.xml");
		AopTestBean bean = (AopTestBean) context.getBean("aopTestBean");
		bean.getAge();
		System.out.println("\r\n===================\r\n");
		bean.getName();
		System.out.println("\r\n===================\r\n");
		bean.appendAgeName();
		System.out.println("\r\n===================\r\n");
		bean.printThrowException();
	}

}
