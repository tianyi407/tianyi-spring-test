package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireTextEditor1 {
	private SpellChecker spellChecker;

	//用在set函数上
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling(1);
	}
}