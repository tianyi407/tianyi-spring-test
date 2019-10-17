package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class SpellChecker {
	// autowired不能用在带具体值的属性上，applicationContext会报错
	private String name = "";
	private String message = "";

	@Autowired(required = false)
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setMessage(String message) {
		this.message = message;
	}

	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor.");
	}

	public void checkSpelling(int no) {
		System.out
				.println("Inside checkSpelling: no = [" + no + "] name = [" + name + "], message = [" + message + "].");
	}
}