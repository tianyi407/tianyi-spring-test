package com.spring.autowire.bean;

public class TextEditor2nd {
	private SpellChecker spellChecker;
	private String name;

	public TextEditor2nd(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public TextEditor2nd(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public String getName() {
		System.out.println("name = " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
