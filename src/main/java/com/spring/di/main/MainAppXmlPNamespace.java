package com.spring.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.bean.TextEditor2nd;
import com.spring.di.bean.XmlPNamespace;

public class MainAppXmlPNamespace {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DiBeans.xml");
		XmlPNamespace obj1 = (XmlPNamespace) context.getBean("xmlPNamespace1");
		obj1.getName();
		obj1.getObj();

		XmlPNamespace obj2 = (XmlPNamespace) context.getBean("xmlPNamespace2");
		obj2.getName();
		obj2.getObj();
	}

}
