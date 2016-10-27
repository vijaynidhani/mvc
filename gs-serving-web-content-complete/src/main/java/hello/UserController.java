package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   
	@Autowired 
	UserRepository userRepository;  
	
	@RequestMapping("/addUser") 
    public String addUser(@RequestParam(name="name") String name, @RequestParam(name="email") String email) {
    	User user=new User(name,email);
        userRepository.save(user);
        return "User added";
    }
	
	@RequestMapping("/listUser")
	public List<User> getList() {
		List<User> list=new ArrayList<>();
		Iterable<User> users=userRepository.findAll();
	    for(User user:users ) {
	        list.add(user);	
	    }		
	    return list;
	}	
	@RequestMapping("/deleteUser") 
	public String deleteUser(@RequestParam(name="id") Long id) {
		User user=userRepository.findOne(id);
		if(user!=null) {
			userRepository.delete(id);
			return "User is deleted";
		} else {
			return "User not found";
		}		
	}
}
