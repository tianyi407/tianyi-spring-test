package com.spring.ioc.container.application.context;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.container.bean.HelloWorldBean;

public class MainAppBeanAfterCtrl {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("IocContainerBeans.xml");
		HelloWorldBean bean1 = (HelloWorldBean) context.getBean("helloWorld");
		bean1.getMessage();
		context.registerShutdownHook();
	}

}
