package com.spring.di.bean;

public class DiConstructorValueBean {
	private int num = 0;
	private String string = null;

	public DiConstructorValueBean(String string, int num) {
		this.string = string;
		this.num = num;
	}

	public int getNum() {
		System.out.println("num = " + num);
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getString() {
		System.out.println("string = " + string);
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
