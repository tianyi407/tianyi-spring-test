package com.spring.aop.bean;

public class AopLoggingXml {
	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeAdvice() {
		System.out.println("Before Adivice ...");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void afterAdvice() {
		System.out.println("After Advice ...");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	public void afterReturningAdvice(Object retVal) {
		if (retVal == null) {
			System.out.println("After Returning Advice: void.");
			return;
		}
		System.out.println("After Returning Advice: " + retVal.toString());
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("After Throwing Advice: " + ex.toString());
	}
}
