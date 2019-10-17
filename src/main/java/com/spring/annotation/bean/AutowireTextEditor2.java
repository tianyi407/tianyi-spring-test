package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireTextEditor2 {
	// 用在引用属性上，可以省掉set方法的声明，不能用在具体值的属性上
	@Autowired
	private SpellChecker spellChecker;

	public void spellCheck() {
		spellChecker.checkSpelling(2);
	}
}