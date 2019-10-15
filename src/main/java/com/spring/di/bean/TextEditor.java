package com.spring.di.bean;

public class TextEditor {
	private SpellChecker spellChecker;
	private SpellChecker2nd spellChecker2;

	public TextEditor(SpellChecker spellChecker, SpellChecker2nd spellChecker2) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
		this.spellChecker2=spellChecker2;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		spellChecker2.checkSpelling();
	}
}
