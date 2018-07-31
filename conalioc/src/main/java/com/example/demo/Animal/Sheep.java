package com.example.demo.Animal;


import org.springframework.stereotype.Component;

@Component
public class Sheep implements Animal {


    private int steps;
    private int hours;
    private String className;

    private String getClassName() {

        className = getClass().toString();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        className = simpleClassName;
        return simpleClassName;
    }


    public Sheep() {
        sleep();
        walk();
        getClassName();
    }

    public int sleep() {

        hours = hours + 16;
        return hours;
    }

    public int walk() {

        steps = 5;
        return steps;
    }


}
