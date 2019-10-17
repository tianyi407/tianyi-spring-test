package com.spring.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.bean.QualifierProfile;

public class MainAppQualifier {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
		QualifierProfile profile = (QualifierProfile) context.getBean("qualifierProfile");
		profile.printAge();
		profile.printName();
	}

}
