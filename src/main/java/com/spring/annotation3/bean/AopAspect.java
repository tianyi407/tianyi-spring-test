package com.spring.annotation3.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAspect {
	// 用于取代：<aop:pointcut
	// expression="execution(* com.spring.annotation3.bean.*.*(..))"
	// id="myPointCut"/>
	// 要求：方法必须是private，没有值，名称自定义，没有参数
	@Pointcut("execution(* com.spring.annotation3.bean.*.*(..))")
	private void myPointCut() {
	}
	
	// 环绕通知
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕开始"); // 开始
		Object obj = proceedingJoinPoint.proceed(); // 执行当前目标方法
		System.out.println("环绕结束"); // 结束
		return obj;
	}

	// 前置通知
	// Before标签，方法执行前触发
	@Before("myPointCut()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.print("前置通知，目标：");
		System.out.print(joinPoint.getTarget() + "方法名称:");
		System.out.println(joinPoint.getSignature().getName());
	}
	
	// 后置通知
	// After标签，方法执行后触发，不考虑执行结果
	@After("myPointCut()")
	public void myAfter() {
		System.out.println("最终通知");
	}

	// 返回通知 after-returning 方法成功执行完成后，void时retVal=null
	@AfterReturning(value = "myPointCut()")
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.print("后置通知，方法名称：" + joinPoint.getSignature().getName());
	}

	// 异常通知
	@AfterThrowing(value = "myPointCut()", throwing = "e")
	public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("异常通知" + "出错了" + e.getMessage());
	}

}
