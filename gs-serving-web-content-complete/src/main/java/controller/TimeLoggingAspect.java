//package controller;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//@Component
//@Aspect
//public class TimeLoggingAspect {
//	
////	@Around("execution(* controller.*.*(..))")
////	public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
////		System.out.println("@Around: Before calculation-"+ new Date());
////		joinPoint.proceed();
////		System.out.println("@Around: After calculation-"+ new Date());
////	}
////	
//	@Before("execution(* controller.*.*(..))")
//	public void before() {
//		System.out.println("TimeLoggingAspect Before controller method.............");
//	}
//	@After("execution(* controller.*.*(..))")
//	public void after() {
//		System.out.println("After controller method execution.............");
//	}
//	
//}