package com.spring.ioc.container.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.container.bean.HelloChildBean;
import com.spring.ioc.container.bean.HelloChildBean2nd;
import com.spring.ioc.container.bean.HelloParentBean;

public class MainAppBeanParentChild {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("IocContainerBeans.xml");

	      HelloParentBean objA = (HelloParentBean) context.getBean("helloParent");

	      objA.getMessage1();
	      objA.getMessage2();

	      HelloChildBean objB = (HelloChildBean) context.getBean("helloChild");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	      
	      HelloChildBean2nd objC = (HelloChildBean2nd) context.getBean("helloChild2nd");
	      objC.getMessage1();
	      objC.getMessage2();
	      objC.getMessage3();

	}

}
