package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        ctx.getBeanDefinitionNames();

        for (int i = 0; i < ctx.getBeanDefinitionNames().length; i++) {
            System.out.println("Bean name : " + ctx.getBeanDefinitionNames()[i]);
        }

    }

}
