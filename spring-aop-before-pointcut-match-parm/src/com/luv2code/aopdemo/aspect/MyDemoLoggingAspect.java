package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	
//	@Before("execution(public void addAccount())")    we can use this also 

//	@Before("execution(public void 	com.luv2code.aopdemo.dao.AccountDAO.addAccount())")   we can use this also
	
//	@Before("execution(public void add*())")  
//	we can use * also it will call all the methods like pattern call any class and any method start with add
	
//	public modifier is optional we can give * also else we can remove it 
//	@Before("execution(* void add*())")  or @Before("execution(void add*())")
	
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
}










