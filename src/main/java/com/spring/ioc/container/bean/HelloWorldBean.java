package com.spring.ioc.container.bean;

public class HelloWorldBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		System.out.println(buildMessage("Your Message : " + message));
		return this.message;
	}

	public void init() {
		System.out.println(buildMessage("Bean is going through init."));
	}

	public void destroy() {
		System.out.println(buildMessage("Bean will destroy now."));
	}

	private String buildMessage(String messageSuffix) {
		return String.format("%s: %s", Thread.currentThread().getStackTrace()[1].getClassName(), messageSuffix);

	}

}
