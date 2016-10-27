package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
      @RequestMapping("/login")
      public String login(@RequestParam String userName,@RequestParam String password) {
    	  if(userName.equals("vijay")) {
    		  return "success";
    	  } else {
    		  return "failure";
    	  }    	  
      }
}
