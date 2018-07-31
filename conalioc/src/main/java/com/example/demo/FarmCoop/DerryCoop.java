package com.example.demo.FarmCoop;

import com.example.demo.Farm.Farm;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class DerryCoop implements FarmCoop {

    public void setFarms(List<Farm> farms) {
        this.farms = farms;
    }

    private List<Farm> farms;
    private String className;

    public DerryCoop(List<Farm> farms) {

        this.farms = farms;
        getClassName();
    }

    public String getClassName() {

        className = getClass().toString();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        className = simpleClassName;
        return simpleClassName;
    }

    public String farmText(){

        return "DerryCoop";
    }

}
