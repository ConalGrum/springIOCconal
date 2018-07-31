package com.example.demo.Animal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Pig")
public class Pig implements Animal {

    private int steps;
    private int hours;
    private String className;

    public String getClassName() {

        className = getClass().toString();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        className = simpleClassName;
        return simpleClassName;
    }


    public Pig() {
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
