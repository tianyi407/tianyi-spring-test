package com.spring.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.bean.TextEditor2nd;

public class MainAppDiProperty {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DiBeans.xml");
		TextEditor2nd te = (TextEditor2nd) context.getBean("textEditor2");
		te.spellCheck();

	}

}
