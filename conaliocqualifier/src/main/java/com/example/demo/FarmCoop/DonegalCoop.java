package com.example.demo.FarmCoop;

import com.example.demo.Farm.Farm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("DonegalCoop")
public class DonegalCoop implements FarmCoop {

    private List<Farm> farms;
    private String className;

    public DonegalCoop(@Qualifier("PigFarm")  List<Farm> farms) {

        this.farms = farms;
        getClassName();
    }

    public String getClassName() {

        className = getClass().toString();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        className = simpleClassName;
        return simpleClassName;
    }

    public String farmText() {

        return "DonegalCoop";
    }
}
