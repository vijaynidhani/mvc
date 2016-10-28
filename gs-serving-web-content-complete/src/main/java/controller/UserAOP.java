package controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAOP {    
//	@Pointcut("execution(* controller.UserController.getList())") 
//    public void before() {
//		System.out.println("Before method Execution .........");
//    } 
}
