package com.anil.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationalControllerTest {
    @Test
    public void addTest(){
        OperationController operationController = new OperationController();
        long result=operationController.add(5,6);
        Assertions.assertEquals(result,11);
    }

    @Test
    public void subTest(){
        OperationController operationController = new OperationController();
        long result=operationController.sub(10,6);
        Assertions.assertEquals(result,4);
    }

    @Test
    public void mulTest(){
        OperationController operationController = new OperationController();
        long result = operationController.mul(4,5);
        Assertions.assertEquals(result,20);
    }

    @Test
    public void divTest(){
        OperationController operationController = new OperationController();
        long result = operationController.div(40,2);
        Assertions.assertEquals(result,20);
    }



}
