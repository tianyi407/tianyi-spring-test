package com.spring.di.bean;

public class DiConstructorValueBean2nd {
	private int num = 0;
	private String string = null;

	public DiConstructorValueBean2nd(int num, String string) {
		this.num = num;
		this.string = string;
	}

	public int getNum() {
		System.out.println("2nd num = " + num);
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getString() {
		System.out.println("2nd string = " + string);
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
