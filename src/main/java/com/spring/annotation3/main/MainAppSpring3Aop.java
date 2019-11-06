package com.spring.annotation3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation3.bean.AopDao;

public class MainAppSpring3Aop {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationSpring3Beans.xml");
		AopDao dao = (AopDao) context.getBean("aopDao");
		dao.add();
	}
}
