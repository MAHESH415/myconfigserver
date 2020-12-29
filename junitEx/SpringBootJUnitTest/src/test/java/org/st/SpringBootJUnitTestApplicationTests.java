package org.st;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource("classpath:application.properties")
class SpringBootJUnitTestApplicationTests {

	@Autowired
	private MockMvc mockmvc;
	
	
	//@Test
	public void testAll() throws Exception {
		
		MockHttpServletRequestBuilder reqBuilder=	
				MockMvcRequestBuilders.get("/emp/all")
		        .header("Accept", "application/json");
    		        
	                  MvcResult result=mockmvc.perform(reqBuilder).andReturn();
	
	MockHttpServletResponse res=result.getResponse();
	
	assertEquals(HttpStatus.OK.value(),res.getStatus());
	
	//assertEquals(HttpStatus.NOT_ACCEPTABLE.value(), res.getStatus());
	
	assertNotNull(res.getContentAsString());
	
	assertEquals("application/json;charset=UTF-8",res.getContentType());
	}
}
