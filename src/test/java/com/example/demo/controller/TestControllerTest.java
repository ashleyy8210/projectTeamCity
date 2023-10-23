package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestControllerTest {

    @Autowired
    TestController testController;

    @Test
    void testGetSquareValue(){
        assertEquals(25, testController.getSquaredValue(5L));
    }
    
}
