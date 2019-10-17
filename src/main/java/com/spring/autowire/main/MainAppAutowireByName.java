package com.spring.autowire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowire.bean.TextEditor;
import com.spring.autowire.bean.TextEditor2nd;

public class MainAppAutowireByName {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireBeans.xml");
		TextEditor te1 = (TextEditor) context.getBean("textEditor");
		te1.spellCheck();
		te1.getName();

		TextEditor te2 = (TextEditor) context.getBean("textEditor2");
		te2.spellCheck();
		te2.getName();

		System.out.println("te1 == te2 : " + te1.equals(te2));

		TextEditor2nd te3 = (TextEditor2nd) context.getBean("textEditor3");
		te3.spellCheck();
		te3.getName();

		TextEditor2nd te4 = (TextEditor2nd) context.getBean("textEditor4");
		te4.spellCheck();
		te4.getName();

		System.out.println("te3 == te4 : " + (te3.hashCode() == te4.hashCode()));
	}

}
