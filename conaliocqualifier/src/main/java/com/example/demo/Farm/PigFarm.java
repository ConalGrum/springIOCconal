package com.example.demo.Farm;

import com.example.demo.Animal.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("PigFarm")
public class PigFarm implements Farm {

    private int baconCount = 0;
    private List<Animal> animals;
    private String className;


    public PigFarm(@Qualifier("Pig") List<Animal> animals) {

        this.animals = animals;
        getClassName();
        getBacon();

    }

    private String getClassName() {

        className = getClass().toString();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        className = simpleClassName;
        return simpleClassName;
    }

    private int getBacon() {

        for (int i = 0; i < animals.size(); i++) {

            baconCount += 10;
        }

        return baconCount;
    }
}
