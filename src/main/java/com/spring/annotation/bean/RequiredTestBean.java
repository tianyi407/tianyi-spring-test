package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Required;

public class RequiredTestBean {
	
	private String name = "";
	private RequiredInnerBean innerBean = null;

	public String getName() {
		System.out.println("name = "+name);
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public RequiredInnerBean getInnerBean() {
		return innerBean;
	}

	@Required
	public void setInnerBean(RequiredInnerBean innerBean) {
		this.innerBean = innerBean;
	}

}
