package com.ejemplo.consume;


	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
	 
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.MediaType;
	import org.springframework.test.context.TestPropertySource;
	import org.springframework.test.context.junit4.SpringRunner;
	import org.springframework.test.web.servlet.MockMvc;
	import static org.hamcrest.Matchers.*;
	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import com.fasterxml.jackson.databind.ObjectMapper;
	 
	@RunWith(SpringRunner.class)
	@SpringBootTest
	@AutoConfigureTestDatabase
	@AutoConfigureMockMvc
	public class ControllerTest {
	 
	    private static final Logger logger = LoggerFactory.getLogger(ControllerTest.class);
	     
	    @Autowired
	    private MockMvc mockMvc;
	 
	    @Autowired
	    ObjectMapper objectmapper;
	     
	 
	    @Test
	    public void testgetSismosFeciniFecfin() throws Exception {
	        String response = mockMvc.perform(get("http://localhost:8080/getSismosFeciniFecfin/{fecini}/{fecfin}", "2014-02-01","2014-02-02"))
	                .andExpect(status().is(HttpStatus.OK.value()))
	                .andReturn().getResponse().getContentAsString();
	 
	        logger.info("response: " + response);
	    }
	     
	    @Test
	    public void testgetSismosMagminMagmax() throws Exception {
	        String response = mockMvc.perform(get("http://localhost:8080/getSismosMagminMagmax/{min}/{max}", 6,7))
	                .andExpect(status().is(HttpStatus.OK.value()))
	                .andReturn().getResponse().getContentAsString();
	 
	        logger.info("response: " + response);
	    }
	    
	    @Test
	    public void testgetSismosHoy() throws Exception {
	        String response = mockMvc.perform(get("http://localhost:8080/getSismosHoy"))
	                .andExpect(status().is(HttpStatus.OK.value()))
	                .andReturn().getResponse().getContentAsString();
	 
	        logger.info("response: " + response);
	    }
	    
	   
	 
	}