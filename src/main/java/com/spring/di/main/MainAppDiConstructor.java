package com.spring.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.bean.DiConstructorValueBean;
import com.spring.di.bean.DiConstructorValueBean2nd;
import com.spring.di.bean.TextEditor;

public class MainAppDiConstructor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DiBeans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

		DiConstructorValueBean db = (DiConstructorValueBean) context.getBean("diConstructorValueBean");
		db.getNum();
		db.getString();

		DiConstructorValueBean2nd db2 = (DiConstructorValueBean2nd) context.getBean("diConstructorValueBean2");
		db2.getNum();
		db2.getString();
	}

}
