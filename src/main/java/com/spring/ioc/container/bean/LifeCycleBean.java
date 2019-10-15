package com.spring.ioc.container.bean;

public class LifeCycleBean extends HelloWorldBean {

	public void init2() {
		System.out.println(buildMessage("Bean is going through init."));
	}

	public void destroy2() {
		System.out.println(buildMessage("Bean will destroy now."));
	}

	private String buildMessage(String messageSuffix) {
		return String.format("%s: %s", Thread.currentThread().getStackTrace()[1].getClassName(), messageSuffix);

	}

}
