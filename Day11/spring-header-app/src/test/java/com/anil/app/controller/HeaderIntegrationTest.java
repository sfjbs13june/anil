package com.anil.app.controller;

import com.anil.app.model.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Base64Utils;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({HeaderController.class})
@ActiveProfiles(value = "test")
public class HeaderIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    @Value("${post.url}")
    String posturl;

   @Test
    public void testSaveStudentPost() throws Exception {
        String secret = "Basic " + Base64Utils.encodeToString(("user123"+":"+"password").getBytes());
        Data data=new Data("1","data1");
        ResultActions responseEntity  = mockMvc.perform(post(posturl).header(HttpHeaders.AUTHORIZATION, secret).header("sessionid","123").contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(data)));
        responseEntity.andExpect(status().isOk());

    }

    private String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent1 = mapper.writeValueAsString(obj);
            return jsonContent1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
