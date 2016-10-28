package controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest 
public class ApplicationTest {  
 
	@Autowired
	private Main controller;
	
    @Test
    public void contextLoads() throws Exception {
    	//assertTrue(true);
    }  
    
//    @Test
//    public void contexLoads() throws Exception {
//        assertThat(controller).isNotNull(); 
//    }
    
//    @Test
//    public void testListUserURL() throws Exception {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + "8080" + "/",
//                String.class)).contains("Hello World");
//       	
//    }
    
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello World")));
//    }
     
}