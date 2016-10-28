package controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAOP {    
	@Before("execution(* controller.UserController.getList())")
    public void before() {
		System.out.println(" UserAOP Before method Execution .........");
    } 
}
