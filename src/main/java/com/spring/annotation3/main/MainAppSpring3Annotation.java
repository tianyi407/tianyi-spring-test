package com.spring.annotation3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation3.bean.PersonAction;

public class MainAppSpring3Annotation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationSpring3Beans.xml");
		PersonAction action = (PersonAction) context.getBean("personAction");
		action.add();
	}

}
