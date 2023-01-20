package com.anil.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({OperationController.class})
public class OperationalControlIntegrationTest {

    @Autowired
    MockMvc mockMvc;
    @Test
    public void addTest() throws Exception{
        long a= (long) 10.0;
        long b= (long) 10.0;
        ResultActions result=mockMvc.perform(get("/add").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData1 = result.andReturn().getResponse().getContentAsString();
       //Assertions.assertEquals(resultData,15);
        Assertions.assertEquals(resultData1, "20");
    }
}
