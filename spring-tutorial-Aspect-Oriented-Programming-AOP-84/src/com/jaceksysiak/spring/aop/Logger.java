package com.jaceksysiak.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger  {
	
	@Pointcut("within(com.jaceksysiak.spring..*)")
	public void withinDemo(){
	}
	@Before("withinDemo()")
	public void withinDemoAdvice(){
		System.out.println("********************** before demo **************************");
	}
	
	
	
	
	
	@Pointcut("target(com.jaceksysiak.spring.aop.Camera)")
	public void targetDemo(){
	}
	@Before("targetDemo()")
	public void targetDemoAdvice(){
		System.out.println("********************** targetDemo **************************");
	}
	
	
	
	
	
	
	@Pointcut("this(com.jaceksysiak.spring.aop.ICamera)")
	public void thisDemo(){
	}
	@Before("thisDemo()")
	public void thisDemoAdvice(){
		System.out.println("********************** thisDemo **************************");
	}
 
}





























