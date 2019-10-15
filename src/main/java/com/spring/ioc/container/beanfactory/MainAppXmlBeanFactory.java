package com.spring.ioc.container.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.bean.HelloWorld;

public class MainAppXmlBeanFactory {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();
		System.out.println("From Class: "+Thread.currentThread().getStackTrace()[1].getClassName());
	}
}
