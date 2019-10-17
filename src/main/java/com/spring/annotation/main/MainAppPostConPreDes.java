package com.spring.annotation.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.bean.PostConstructPreDestroy;

public class MainAppPostConPreDes {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
		PostConstructPreDestroy obj = (PostConstructPreDestroy) context.getBean("postConPreDes");
		obj.printMessage();
		context.registerShutdownHook();
	}

}
