package com.example.demo;

import com.example.demo.FarmCoop.FarmCoop;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;



@ContextConfiguration(classes = DemoApplication.class)
@SpringBootTest
public class TestJava {

    @Autowired
    FarmCoop farmBusiness;


    @Test
    public void testMethod() {

//        System.out.println(farmBusiness.farmText());
        String result = farmBusiness.farmText();
//
    }
}
