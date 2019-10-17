package com.spring.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.bean.RequiredTestBean;

public class MainAppRequired {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
		RequiredTestBean bean = (RequiredTestBean) context.getBean("requiredTestBean");
		bean.getName();
		bean.getInnerBean().getMessage1();
		bean.getInnerBean().getMessage2();
	}

}
