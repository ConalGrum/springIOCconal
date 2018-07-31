package com.example.demo.Farm;

import com.example.demo.Animal.Animal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SheepFarm implements Farm {

    private int woolCount = 0;
    private List<Animal> animals;
    private String className;


    public SheepFarm(List<Animal> animals) {

        this.animals = animals;
        getClassName();
        getWool();

    }

    public String getClassName() {

        className = getClass().toString();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        className = simpleClassName;
        return simpleClassName;
    }

    public int getWool() {

        for (int i = 0; i < animals.size(); i++) {

            woolCount++;
        }

        return woolCount;
    }
}
