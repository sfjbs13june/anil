package com.anil.app.springcontroller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


 @RunWith(SpringRunner.class)
 @WebMvcTest({HelloController.class})



public class HelloControllerIntegrationTest {
    @Autowired
    public MockMvc mockMvc;

    @Test
     public void testHelloControllerWelcome1() throws Exception {
        String name ="world";
        ResultActions responseEntity = mockMvc.perform(get("/welcome1").param("name",name));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals( "Welcome to " +name, result);
    }

     @Test
     public void testHelloControllerSentMessage() throws Exception {
         String message="hi";
         ResultActions responseEntity  = mockMvc.perform(get("/send/" +message));
         responseEntity.andExpect(status().isOk());
         String result = responseEntity.andReturn().getResponse().getContentAsString();

        // assertEquals("send message "+message, result);
         assertEquals( "send message " +message, result);
     }


}
