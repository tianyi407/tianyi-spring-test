package com.spring.ioc.container.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.container.bean.HelloWorldBean;

public class MainAppBeanScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("IocContainerBeans.xml");
		HelloWorldBean bean1 = (HelloWorldBean) context.getBean("scopeSingletonBean");
		bean1.setMessage("Test Scope");
		bean1.getMessage();
		
		HelloWorldBean bean2 = (HelloWorldBean) context.getBean("scopeSingletonBean");
		bean2.getMessage();
		
		HelloWorldBean bean3 = (HelloWorldBean) context.getBean("scopePrototypeBean");
		bean3.setMessage("Test Scope");
		bean3.getMessage();
		
		HelloWorldBean bean4 = (HelloWorldBean) context.getBean("scopePrototypeBean");
		bean4.getMessage();
	}

}
