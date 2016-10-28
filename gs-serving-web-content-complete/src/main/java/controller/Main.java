package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	
   @RequestMapping("/") 
   public String root() {
	   return "main";
   }
   
   @RequestMapping("/welcome")
   public String main() {
	   return "main";
   }
}
