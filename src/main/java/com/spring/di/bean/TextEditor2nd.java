package com.spring.di.bean;

public class TextEditor2nd {
	private SpellChecker spellChecker;
	private SpellChecker2nd spellChecker2;

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void setSpellChecker2nd(SpellChecker2nd spellChecker2) {
		this.spellChecker2 = spellChecker2;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		spellChecker2.checkSpelling();
	}
}
