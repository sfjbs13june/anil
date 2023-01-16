package com.anil.app.springcontroller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    HelloController helloController=new HelloController();
    @Test
    public void testSayHello(){
        String expectedResult="Hello from App";
        String result=helloController.Sayhello();
        helloController.Sayhello();
        Assert.assertEquals(expectedResult,result);
    }
}
