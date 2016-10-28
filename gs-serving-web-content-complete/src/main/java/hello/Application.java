package hello;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	public static Logger log=LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("Application started................");
    }    
    
    @Bean 
    public CommandLineRunner demo(UserRepository repository) {
    	return(args) -> {
    	   log.info("Loading user in the memory...");
    	   repository.save(new User("vijay@nidhani.com","vijay"));
    	   repository.save(new User("suman@nidhani.com","suman"));
     	   Iterable<User> list=repository.findAll();
     	   for(User user:list) {
     		   System.out.println(user);
     	   }
     	   
     	   System.out.println(list);
     	   List<User> user=repository.findByName("suman");
     	   System.out.println("User found : "+user);
     	   
     	   log.info("Loading done.............."); 
    	};
    	
    }
}
