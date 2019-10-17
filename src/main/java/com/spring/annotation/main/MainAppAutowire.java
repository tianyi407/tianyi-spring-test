package com.spring.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.bean.AutowireTextEditor1;
import com.spring.annotation.bean.AutowireTextEditor2;
import com.spring.annotation.bean.AutowireTextEditor3;

public class MainAppAutowire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
		AutowireTextEditor1 text1 = (AutowireTextEditor1) context.getBean("autowireText1");
		text1.spellCheck();

		AutowireTextEditor2 text2 = (AutowireTextEditor2) context.getBean("autowireText2");
		text2.spellCheck();

		AutowireTextEditor3 text3 = (AutowireTextEditor3) context.getBean("autowireText3");
		text3.spellCheck();
	}

}
