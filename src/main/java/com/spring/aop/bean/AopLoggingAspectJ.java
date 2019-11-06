package com.spring.aop.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//声明为AspectJ class，可以使用aspectJ注解
@Aspect
public class AopLoggingAspectJ {

	/**
	 * 声明一个共用的触发点pointcut 用于取代：<aop:pointcut expression="execution(*
	 * com.spring.aop.bean.AopTestBean.*(..))" id= "allApi"/>
	 * 要求：方法必须是private，没有值，名称自定义，没有参数
	 */
	@Pointcut("execution(* com.spring.aop.bean.AopTestBean.*(..))")
	private void allApi() {
	}

	/**
	 * Before标签，方法执行前触发，指向allApi pointcut
	 */
	@Before("allApi()")
	public void beforeAdvice() {
		System.out.println("Before Adivice ...");
	}

	/**
	 * After标签，方法执行后触发，不考虑执行结果，指向allApi pointcut
	 */
	@After("allApi()")
	public void afterAdvice() {
		System.out.println("After Advice ...");
	}

	/**
	 * after-returning 方法成功执行完成后，void时retVal=null，指向allApi pointcut
	 */
	@AfterReturning(pointcut = "allApi()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		if (retVal == null) {
			System.out.println("After Returning Advice: void.");
			return;
		}
		System.out.println("After Returning Advice: " + retVal.toString());
	}

	/**
	 * after-throwing 方法退出抛出异常时，指向allApi pointcut
	 */
	@AfterThrowing(pointcut = "allApi()", throwing = "ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("After Throwing Advice: " + ex.toString());
	}

	/**
	 * 单独的一个before方法，指定自己单独的触发点
	 */
	@Before("execution(* com.spring.aop.bean.AopTestBean.appendAgeName(..))")
	public void beforeAdviceSingle() {
		System.out.println("Before Adivice ... ## Single");
	}
}
