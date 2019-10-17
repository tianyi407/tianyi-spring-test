package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireTextEditor3 {
	private SpellChecker spellChecker;

	// 用在构造方法上
	@Autowired
	public AutowireTextEditor3(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling(3);
	}
}